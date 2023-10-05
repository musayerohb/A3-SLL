import java.util.NoSuchElementException;

/** Keeps track of position in a linked list */
public class SLL_Iterator<T> implements Phase5SLL_Iterator<T> {
    private NodeSL<T> prev;
    private NodeSL<T> prev2;
    private NodeSL<T> next;
    SLL<T> list;
    private boolean onLeft;

    /**
     * Creates a new iterator on the given list.
     * Default position is leftmost
     * 
     * @param list the list to iterate on
     */
    public SLL_Iterator(SLL<T> list) {
        this.list = list;
        this.next = list.getHead();
        this.prev = null;
        this.prev2 = null;
        this.onLeft = true;
    }

    /**
     * Tests whether there are any more
     * 
     * @return T/F is it safe to call next()?
     */
    public boolean hasNext() {
        //why does prev work and next == null work and not the code before?? even prev == null doesn't work. 
        if (prev == list.getTail()) {
            return false;
        }
        else if (prev == null && next == null) {
            return false;
        }
        return true;
    }

    /**
     * Returns next or throws an exception
     * and advances the iterator
     * 
     * @return the next element
     */
    public T next() {
        if (next == list.getHead()) {
            T nextValue = next.getData();
            next = next.getNext();
            prev = list.getHead();
            prev2 = null;
            return nextValue;
        }

        else if (!hasNext()) {
        next = null;
        prev = list.getHead();
        prev2 = null;
        throw new NoSuchElementException();
        }
        T nextValue = next.getData();
        

        prev2 = prev;
        prev = next;
        next = next.getNext();

        return nextValue;
    }

    /**
     * Sets the data for the element just passed
     * 
     * @param data value to set
     */
    public void set(T data) {
        if (this.list.isEmpty() == true) {
            throw new MissingElementException();
        }
        else if (this.next != null) {
            this.prev.setData(data);
        }
        else {
            this.prev.setData(data);
        }
    }

    /**
     * Returns the data for the element just passed
     * 
     * @return data value in the element just passed
     */
    public T get() { 
        return prev.getData();
    }

    /**
     * Inserts a node with the specified data
     * Cannot be called twice in a row without intervening next()
     * 
     * @param data the value to insert
     */
    public void add(T data) {
        
        if (this.list.isEmpty() == true) {
            this.list.addFirst(data);
            prev2 = null;
            prev = null;
            next = list.getHead();
            return;
        }
    
        else {
            list.addAfter(next, data);
        }


    }

    /**
     * Removes the node just passed
     * Cannot be called twice in a row without intervening next()
     */
    public void remove() {
        this.list.removeAfter(next);
        if (this.list.isEmpty() == true) {
            SLL<String> newList = new SLL<String>();
            newList.removeFirst();
        }
    }
}