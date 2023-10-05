# Assignment 3: Linked List Implementation

For this assignment you will develop your own implementation of a singly linked list.  We've arranged the instructions in an order that makes sense for incremental development and provides plenty of opportunity to test your progress along the way.  To maintain uniformity in naming, your classes should be named `SLL`, and your program should eventually implement the three interfaces included with the assignment.  We'll develop starter code together that includes stubs for some of the necessary methods.  (A *stub* is a short method definition that has the correct call signature and the minimal implementation required for clean compilation.)

## Phase 1: Basic List Creation & Printing

For this first phase we just want to complete a minimal set of methods so that we can create a linked list with a few elements in it, verify that it has the correct structure, and print the elements to the console (for later use in debugging).  We will need the following:

* A constructor that makes an empty list.  It should have `head` and `tail` references that are both `null`.
* A method to check if a list `isEmpty`
* Accessors for `getHead` and `getTail` (We may eventually need setters as well, but they're not necessary right away.)
* Accessors and manipulators in the Node class to `getData`, `setData`, `getNext` and `setNext`.  (Typically LinkedList implementations don't have a `setNext` method because that could imperil the structure of the list, but because we haven't nested our Node classes we'll have to use this workaround.)
* The method `addFirst` to add a new element at the front of the list.  This will have a special case to handle if the list is initially empty.  Check the lecture slides for a discussion of how this method works.
* The method `toString` so that the list can be printed.  More details on this appear below.

At this point you should be thinking about testing your class.  To keep the workload down, we are providing a comprehensive set of tests for this assignment.  However, in order to compile the project with all these tests in place, you need to provide working definitions for all the methods in all phases of the assignment.  They don't need to do anything yet, but they must at least be defined.  Function definitions that are in place to help other code compile but are not yet implemented themselves are called ***stubs***.  You should make a set of stubs now for all the methods defined in the three interface files `Phase1SLL.java`, `Phase2SLL.java`, and `Phase3SLL.java`.  Remember, these stubs don't have to actually _do_ anything yet.  If the method signature indicates that they return a value, you can return a dummy value -- i.e., the easiest thing you can come up with that has the correct type.  For objects types, `null` will do nicely.  For numbers, `0` is a fine choice.  Booleans can be either `true` or `false` depending on your mood.

Once you have written stubs for all the required methods, your program should compile, and you can run the tests.  It won't pass everything yet, but hopefully it passes the Phase 1 tests at least.  (A note on different platforms:  if you are using VSCode or IntelliJ, the built-in testing controls should run the tests located in `SLLTest.java`. If you are working from the command line, then running `TestMethods` will run all the tests and display the results.)

Now let's talk about the details of `toString`.  This will assemble and return a `String` variable representing the contents of the list.  Let's suppose that we want it to output something like this when called on the list above:

    [C, B, A]

So we need to create a variable to hold our accumulating string.  Initialize it with a bracket, then loop through all but the last element, adding them to the string with trailing commas. Finally add the last element and a closing bracket.  (If the list is empty, skip trying to add the last element and just add the closing bracket.)  Below is a `for` loop that will traverse the list, stopping just before the last element.  You can use that as a building block to construct your method.

    for (Node item = this.head; item != list.tail; item = item.next) {
      // item is a node in the list
    }

Once your `toString` method is completed, you should be able to display the contents of your list at any point in the usual way:

    System.out.println(list);

Keep in mind that if your list structure is nonstandard due to bugs in your implementation, it may give unpredictable results.  The loop might even fail to terminate.  A list that just has passed the tests outlined above should be correct, so you can use that for testing.

## Phase 2:  More List Manipulators & Miscellaneous Methods

Now that you've gotten a basic list up and running, it's time to add more methods that allow you to alter its contents in different ways.  It's worth drawing a picture of each scenario before you try to implement it.  Figure out what links need to be updated.  Think about special cases that should be handled.  Try to anticipate all the tests we will apply.  (If you want, you can write your own set.)

Start with `removeFirst`, then do `addLast` and `removeLast`.  Finally work on `addAfter` and `removeAfter`.  Tackle one at a time, and try to get it passing all the relevant tests before going on to the next one.  **No, really!**  You want to catch any bugs in one method before going on to the next, otherwise you'll never be sure whether a problem is in the new thing you are working on or something earlier.

This would also be a good time to add a `size` method.  It needs to loop through all the elements to count how many there are.  (Alternately, your implementation could add a field to keep track of the total number at any given time as they are added or removed.  This sounds convenient, except that you have to remember always to update it when you perform an operation that changes the length. 
 Probably it is easier just to count when necessary.)

While working on this stage, it's pretty easy to accidentally write code that goes into an infinite loop.  If your program seems frozen, **that's a sign**.  While developing, you may want to include a print statement inside every loop so you can easily detect this sort of bug.  Only remove it (or comment out) when you are sure that things are working properly -- but don't forget to do so before you submit your work!  If you do find that your code is looping infinitely, try drawing a picture of what is happening to understand why.

## Phase 3:  Whole-List Operations

The first two phases were about building up and editing single lists.  In this phase you will add methods that split and combine lists.  These will come in two flavors, copying style and transfer style.  As in the previous phase, you should write tests for each method before you try to develop it.

For the copying style, begin by writing a **copy constructor**.  As its name indicates, this is a constructor that takes a linked list object as its sole parameter, and returns a *deep copy* of its structure.  This will be a completely separate memory structure with the same number of elements, holding the same values.  You can make it by looping through the original structure and copying a node at a time.  (Consider how you can use existing methods, e.g., `addFirst` or `addLast`.)

Next, add `subseqByCopy` and `spliceByCopy`.  Since you are making copies, these will also require looping.
* `subseqByCopy(here,n)` returns a copy of a subsequence of the list.  The subsequence starts at `here` and contains `n` nodes.  (If the original list is too short to provide the requested number of nodes, throw an exception.)  `this` remains unchanged.
* `spliceByCopy(list,afterHere)` copies the nodes of `list` and adds them to `this` following the node `afterHere`.  If `afterHere` is null it adds them at the head of `this`.  The contents of `list` remain unchanged.

For transfer style, you will write `subseqByTransfer` and `spliceByTransfer`.  These should transfer nodes as a group from one list to another juat by updating a few links, and will not require looping.
* `subseqByTransfer(afterHere,toHere)` extracts a subsequence out of the original list and returns it as a new list (thus shortening the original list).  The extracted sequence begins with the element following `afterHere` and goes up to and including `toHere`.  The original list should skip from `afterHere` to the element that originally followed `toHere`.  If `afterHere` is `null` it should extract a sequence from the head of the list onwards.
* `spliceByTransfer(list,afterHere)` moves all the elements of `list` into `this` just after the node `afterHere`.  The input argument `list` should be left empty after the transfer.

## Phase Four:  Exceptions

There is no interface for this phase.  Instead of assing new methods, you will add make sure that the existing ones properly handle certain erroneous conditions by throwing an appropriate exception.  We have defined these exception classes for you.  Read their documentation and figure out which of your existing methods should throw them, and under what circumstances.  Note that you can throw an exception like so:
    `throw new MissingElementException();`


## Phase Five:  `SLL_Iterator`

For the final phase, you will make a simple iterator class to go with your linked list.  The constructor will take an `SLL` object and return an iterator located just before the head element.  The class should implement the methods defined in the `Phase5SLL` interface.  We have given you a starter class file with stubs already in place.