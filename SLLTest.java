import org.junit.*;
import java.lang.Exception;

public class SLLTest {

    // Define data that will be used to test the SLL class
    public static final String[] abc = { "A", "B", "C" };
    public static final String[] a = { "A" };
    public static final String[] empty = {};
    public static final String[] ab = { "A", "B" };
    public static final String[] b = { "B" };
    public static final String[] cba = { "C", "B", "A" };
    public static final String[] ba = { "B", "A" };
    public static final String[] bac = { "B", "A", "C" };
    public static final String[] abdc = { "A", "B", "D", "C" };
    public static final String[] dac = { "D", "A", "C" };
    public static final String[] eb = { "E", "B" };
    public static final String[] dbac = { "D", "B", "A", "C" };
    public static final String[] ac = { "A", "C" };
    public static final String[] e = { "E" };
    public static final String[] debac = { "D", "E", "B", "A", "C" };
    public static final String[] fg = { "F", "G" };
    public static final String[] debacfg = { "D", "E", "B", "A", "C", "F", "G" };
    public static final String[] hi = { "H", "I" };
    public static final String[] hidebacfg = { "H", "I", "D", "E", "B", "A", "C", "F", "G" };
    public static final String[] dbc = { "D", "B", "C" };
    public static final String[] dec = { "D", "E", "C" };
    public static final String[] def = { "D", "E", "F" };

    @Test
    public void check_methods() {
        /*
         * Test that all expected methods exist by ensuring
         * NoSuchMethodError is not thrown when they are called
         */
        SLL<String> list = new SLL<>();

        try {
            Assert.assertTrue("empty head is null", null == list.getHead());
            Assert.assertTrue("empty tail is null", null == list.getTail());
            Assert.assertTrue("empty list is empty", list.isEmpty());
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method: " + e);
        }

    }

    @Test
    public void test_addFirst_1() {
        SLL<String> list = new SLL<>();

        boolean thrown = false;
        try {
            list.addFirst("A");
            Assert.assertTrue("list of 1 isn't empty", !list.isEmpty());
            Assert.assertTrue("same head and tail of singleton", list.getHead() == list.getTail());
            Assert.assertTrue("data correct", list.getHead().getData().equals("A"));
            Assert.assertTrue("tail's next is null", null == list.getTail().getNext());
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method: " + e);
        }
    }

    @Test
    public void test_addFirst_2() {
        SLL<String> list = new SLL<>();

        boolean thrown = false;
        try {
            list.addFirst("A");
            list.addFirst("B");
            Assert.assertTrue("list of 2 isn't empty", !list.isEmpty());
            Assert.assertTrue("second node is tail", list.getHead().getNext() == list.getTail());
            Assert.assertTrue("first element is B", list.getHead().getData().equals("B"));
            Assert.assertTrue("second element is A", list.getHead().getNext().getData().equals("A"));
            Assert.assertTrue("tail's next is null", null == list.getTail().getNext());
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method: " + e);
        }
    }

    @Test
    public void test_addFirst_3() {
        SLL<String> list = new SLL<>();

        try {
            list.addFirst("A");
            list.addFirst("B");
            list.addFirst("C");
            Assert.assertTrue("list of 3 isn't empty", !list.isEmpty());
            Assert.assertTrue("third node is tail", list.getHead().getNext().getNext() == list.getTail());
            Assert.assertTrue("first element is C", list.getHead().getData().equals("C"));
            Assert.assertTrue("second element is B", list.getHead().getNext().getData().equals("B"));
            Assert.assertTrue("third element is A", list.getHead().getNext().getNext().getData().equals("A"));
            Assert.assertTrue("tail's next is null", null == list.getTail().getNext());

            String s = TestMethods.verifySLL(list, cba);
            Assert.assertTrue("3-list contents " + s, s.equals(""));
        } catch (NoSuchMethodError e) {
            Assert.fail("addFirst 3 test exception: " + e);
        } catch (Exception e) {
            Assert.fail("Test missing method: " + e);
        }
    }

    @Test
    public void test_toString() {
        try {
            SLL<String> list = new SLL<>();
            Assert.assertTrue("empty list is []", list.toString().equals("[]"));
            list.addFirst("A");
            Assert.assertTrue("list [A]", list.toString().equals("[A]"));
            list.addFirst("B");
            Assert.assertTrue("list [B, A]", list.toString().equals("[B, A]"));
            list.addFirst("C");
            Assert.assertTrue("list [C, B, A]", list.toString().equals("[C, B, A]"));
        } catch (NoSuchMethodError e) {
            Assert.fail("toString test exception: " + e);
        } catch (Exception e) {
            Assert.fail("Test missing method: " + e);
        }
    }

    @Test
    public void test_removeFirst() {
        try {
            SLL<String> list = TestMethods.makeSLL(cba);
            Assert.assertTrue("remove C", list.removeFirst().equals("C"));
            String s = TestMethods.verifySLL(list, ba);
            Assert.assertTrue("removeFirst --> BA " + s, s.equals(""));
            Assert.assertTrue("remove B", list.removeFirst().equals("B"));
            s = TestMethods.verifySLL(list, a);
            Assert.assertTrue("removeFirst --> A " + s, s.equals(""));
            Assert.assertTrue("remove A", list.removeFirst().equals("A"));
            s = TestMethods.verifySLL(list, empty);
            Assert.assertTrue("removeFirst -> empty " + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test removeFirst exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_addLast() {
        try {
            // System.out.println("[addLast]");
            SLL<String> list = new SLL<String>();
            list.addLast("A");
            String s = TestMethods.verifySLL(list, a);
            Assert.assertTrue("addLast -> A " + s, s.equals(""));
            list.addLast("B");
            s = TestMethods.verifySLL(list, ab);
            Assert.assertTrue("addLast -> AB " + s, s.equals(""));
            list.addLast("C");
            s = TestMethods.verifySLL(list, abc);
            Assert.assertTrue("addLast -> ABC " + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test addLast exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_removeLast() {
        try {
            // System.out.println("[removeLast]");
            SLL<String> list = TestMethods.makeSLL(abc);
            Assert.assertTrue("removeLast C", list.removeLast().equals("C"));
            String s = TestMethods.verifySLL(list, ab);
            Assert.assertTrue("removeLast -> AB" + s, s.equals(""));
            Assert.assertTrue("removeLast B", list.removeLast().equals("B"));
            s = TestMethods.verifySLL(list, a);
            Assert.assertTrue("removeLast -> A" + s, s.equals(""));
            Assert.assertTrue("removeLast A", list.removeLast().equals("A"));
            s = TestMethods.verifySLL(list, empty);
            Assert.assertTrue("removeLast -> empty" + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test removeLast exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_size() {
        try {
            // System.out.println("[size]");
            SLL<String> list = new SLL<String>();
            Assert.assertTrue("size of empty", 0 == list.size());
            list = TestMethods.makeSLL(a);
            Assert.assertTrue("size of A", 1 == list.size());
            list = TestMethods.makeSLL(ba);
            Assert.assertTrue("size of BA", 2 == list.size());
            list = TestMethods.makeSLL(cba);
            Assert.assertTrue("size of CBA", 3 == list.size());
        } catch (Exception e) {
            Assert.fail("Test size exception:  " + e);
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_addAfter() {
        try {
            // System.out.println("[addAfter]");
            SLL<String> list = TestMethods.makeSLL(a);
            list.addAfter(list.getHead(), "B");
            String s = TestMethods.verifySLL(list, ab);
            Assert.assertTrue("A.addAfter(A,B)" + s, s.equals(""));
            list.addAfter(list.getTail(), "C");
            s = TestMethods.verifySLL(list, abc);
            Assert.assertTrue("AB.addAfter(B,C)" + s, s.equals(""));
            list.addAfter(list.getHead().getNext(), "D");
            s = TestMethods.verifySLL(list, abdc);
            Assert.assertTrue("ABC.addAfter(B,D)" + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test addAfter exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_removeAfter() {
        try {
            // System.out.println("[removeAfter]");
            SLL<String> list = TestMethods.makeSLL(abc);
            Assert.assertTrue("ABC after B", list.removeAfter(list.getHead().getNext()).equals("C"));
            String s = TestMethods.verifySLL(list, ab);
            Assert.assertTrue("ABC removeAfter B -> AB" + s, s.equals(""));
            Assert.assertTrue("AB after A", list.removeAfter(list.getHead()).equals("B"));
            TestMethods.verifySLL(list, a);
            Assert.assertTrue("AB removeAfter A -> A" + s, s.equals(""));
            try {
                Assert.assertTrue("A after null", list.removeAfter(null).equals("A"));
                s = TestMethods.verifySLL(list, empty);
                Assert.assertTrue("A removeAfter null -> empty" + s, s.equals(""));
            } catch (NullPointerException npe) {
                Assert.fail("removeAfter exception on null argument");
            }
        } catch (Exception e) {
            Assert.fail("Test removeAfter exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_copy_constructor() {
        try {
            // System.out.println("[subseqByCopy]");
            SLL<String> list = TestMethods.makeSLL(bac);
            String s = TestMethods.verifySLL(new SLL<String>(list), bac);
            Assert.assertTrue("copy BAC" + s, s.equals(""));
            s = TestMethods.verifySLL(new SLL<String>(new SLL<String>()), empty);
            Assert.assertTrue("copy empty" + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test copy constructor exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_subseqByCopy() {
        try {
            // System.out.println("[subseqByCopy]");
            SLL<String> list = TestMethods.makeSLL(bac);
            SLL<String> list2 = list.subseqByCopy(list.getHead(), 2);
            String s = TestMethods.verifySLL(list2, ba);
            Assert.assertTrue("BAC.subseqByCopy(B,2) -> BA" + s, s.equals(""));
            s = TestMethods.verifySLL(list, bac);
            Assert.assertTrue("BAC.subseqByCopy(B,2): BAC same" + s, s.equals(""));
            Assert.assertTrue("Not shallow BA", list.getHead().getNext() != list2.getTail());
            list2 = list.subseqByCopy(list.getHead().getNext(), 2);
            s = TestMethods.verifySLL(list2, ac);
            Assert.assertTrue("BAC.subseqByCopy(A,2) -> AC" + s, s.equals(""));
            s = TestMethods.verifySLL(list, bac);
            Assert.assertTrue("BAC.subseqByCopy(A,2): BAC same" + s, s.equals(""));
            Assert.assertTrue("Not shallow AC", list.getTail() != list2.getTail());
        } catch (Exception e) {
            Assert.fail("Test subseqByCopy exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_spliceByCopy() {
        try {
            // System.out.println("[spliceByCopy]");
            SLL<String> list = TestMethods.makeSLL(dac);
            SLL<String> list2 = TestMethods.makeSLL(eb);
            list.spliceByCopy(list2, list.getHead());
            String s = TestMethods.verifySLL(list, debac);
            Assert.assertTrue("DAC.spliceByCopy(EB,D) -> DEBAC" + s, s.equals(""));
            s = TestMethods.verifySLL(list2, eb);
            Assert.assertTrue("DAC.spliceByCopy(EB,D): EB same" + s, s.equals(""));
            Assert.assertTrue("Not shallow EB", list.getHead().getNext().getNext() != list2.getTail());
            list = TestMethods.makeSLL(debac);
            list2 = TestMethods.makeSLL(fg);
            list.spliceByCopy(list2, list.getTail());
            s = TestMethods.verifySLL(list, debacfg);
            Assert.assertTrue("DEBAC.spliceByCopy(FG,C) -> DEBACFG" + s, s.equals(""));
            s = TestMethods.verifySLL(list2, fg);
            Assert.assertTrue("DEBAC.spliceByCopy(FG,C): FG same" + s, s.equals(""));
            Assert.assertTrue("Not shallow FG", list.getTail() != list2.getTail());
            list = TestMethods.makeSLL(debacfg);
            list2 = TestMethods.makeSLL(hi);
            list.spliceByCopy(list2, null);
            s = TestMethods.verifySLL(list, hidebacfg);
            Assert.assertTrue("DEBACFG.spliceByCopy(HI,null) -> HIDEBACFG" + s, s.equals(""));
            s = TestMethods.verifySLL(list2, hi);
            Assert.assertTrue("DEBACFG.spliceByCopy(HI,null): HI same" + s, s.equals(""));
            Assert.assertTrue("Not shallow HI", list.getHead().getNext() != list2.getTail());
            list = TestMethods.makeSLL(abc);
            list2 = TestMethods.makeSLL(empty);
            list.spliceByCopy(list2, list.getHead().getNext());
            s = TestMethods.verifySLL(list, abc);
            Assert.assertTrue("ABC.spliceByCopy(empty,B) -> ABC" + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test spliceByCopy exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_subseqByTransfer() {
        try {
            // System.out.println("[subseqByTransfer]");
            SLL<String> list = TestMethods.makeSLL(debac);
            SLL<String> list2 = list.subseqByTransfer(list.getHead(), list.getHead().getNext().getNext());
            String s = TestMethods.verifySLL(list2, eb);
            Assert.assertTrue("DEBAC.subseqByTransfer(D,B) -> EB" + s, s.equals(""));
            s = TestMethods.verifySLL(list, dac);
            Assert.assertTrue("DEBAC.subseqByTransfer(D,B) becomes DAC" + s, s.equals(""));
            list = TestMethods.makeSLL(abc);
            list2 = list.subseqByTransfer(list.getHead(), list.getHead().getNext());
            s = TestMethods.verifySLL(list2, b);
            Assert.assertTrue("ABC.subseqByTransfer(A,B) -> B" + s, s.equals(""));
            s = TestMethods.verifySLL(list, ac);
            Assert.assertTrue("ABC.subseqByTransfer(A,C) becomes AC" + s, s.equals(""));
            list = TestMethods.makeSLL(debacfg);
            list2 = list.subseqByTransfer(list.getHead().getNext().getNext().getNext().getNext(), list.getTail());
            s = TestMethods.verifySLL(list2, fg);
            Assert.assertTrue("DEBACFG.subseqByTransfer(C,G) -> FG" + s, s.equals(""));
            s = TestMethods.verifySLL(list, debac);
            Assert.assertTrue("DEBACFG.subseqByTransfer(C,G) becomes DEBAC" + s, s.equals(""));
            list = TestMethods.makeSLL(hidebacfg);
            list2 = list.subseqByTransfer(null, list.getHead().getNext());
            s = TestMethods.verifySLL(list2, hi);
            Assert.assertTrue("HIDEBACFG.subseqByTransfer(null,I) -> HI" + s, s.equals(""));
            s = TestMethods.verifySLL(list, debacfg);
            Assert.assertTrue("HIDEBACFG.subseqByTransfer(null,I) becomes DEBACFG" + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test subseqByTransfer exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_spliceByTransfer() {
        try {
            // System.out.println("[spliceByTransfer]");
            SLL<String> list = TestMethods.makeSLL(dbac);
            SLL<String> list2 = TestMethods.makeSLL(e);
            list.spliceByTransfer(list2, list.getHead());
            String s = TestMethods.verifySLL(list, debac);
            Assert.assertTrue("DBAC.spliceByTransfer(E,D) -> DEBAC" + s, s.equals(""));
            s = TestMethods.verifySLL(list2, empty);
            Assert.assertTrue("DBAC.spliceByTransfer(E,D) empties E" + s, s.equals(""));
            list = TestMethods.makeSLL(debac);
            list2 = TestMethods.makeSLL(fg);
            list.spliceByTransfer(list2, list.getHead().getNext().getNext().getNext().getNext());
            s = TestMethods.verifySLL(list, debacfg);
            Assert.assertTrue("DEBAC.spliceByTransfer(E,D) -> DEBACFG" + s, s.equals(""));
            s = TestMethods.verifySLL(list2, empty);
            Assert.assertTrue("DEBAC.spliceByTransfer(E,D) empties FG" + s, s.equals(""));
            list = TestMethods.makeSLL(debacfg);
            list2 = TestMethods.makeSLL(hi);
            list.spliceByTransfer(list2, null);
            s = TestMethods.verifySLL(list, hidebacfg);
            Assert.assertTrue("DEBACFG.spliceByTransfer(HI,null) -> HIDEBACFG" + s, s.equals(""));
            s = TestMethods.verifySLL(list2, empty);
            Assert.assertTrue("DEBACFG.spliceByTransfer(HI,null) empties HI" + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test spliceByTransfer exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_MEE1() {
        try {
            // System.out.println("[Missing Element Exception 1]");
            SLL<String> list = new SLL<>();
            String[] empty = {};

            /*
             * Originally this used a lambda to run list.removeFirst(), but my IDE suggested
             * the :: notation
             */
            Assert.assertThrows("removeFirst from empty list",
                    MissingElementException.class,
                    list::removeFirst);
        } catch (Exception e) {
            Assert.fail("Test spliceByCopy exception:  " + e);
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_MEE2() {
        try {
            // System.out.println("[Missing Element Exception 2]");
            SLL<String> list = new SLL<>();
            String[] empty = {};
            Assert.assertThrows("removeLast from empty list",
                    MissingElementException.class,
                    list::removeLast);
        } catch (Exception e) {
            Assert.fail("Test spliceByCopy exception:  " + e);
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_MEE3() {
        try {
            // System.out.println("[Missing Element Exception 3]");
            SLL<String> list = new SLL<String>();
            Assert.assertThrows("removeAfter from empty list",
                    MissingElementException.class,
                    () -> {
                        list.removeAfter(null);
                    });
        } catch (Exception e) {
            Assert.fail("Test spliceByCopy exception:  " + e);
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_SIE1() {
        try {
            // System.out.println("[Self Insert Exception 1]");
            String[] ab = { "A", "B" };
            SLL<String> list = TestMethods.makeSLL(ab);

            Assert.assertThrows("self spliceByTransfer",
                    SelfInsertException.class,
                    () -> {
                        list.spliceByTransfer(list, list.getHead());
                    });
        } catch (Exception e) {
            Assert.fail("Test spliceByCopy exception:  " + e);
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_SIE2() {
        try {
            // System.out.println("[Self Insert Exception 2]");
            String[] ab = { "A", "B" };
            SLL<String> list = TestMethods.makeSLL(ab);

            Assert.assertThrows("self spliceByTransfer",
                    SelfInsertException.class,
                    () -> {
                        list.spliceByCopy(list, list.getHead());
                    });
        } catch (Exception e) {
            Assert.fail("Test spliceByCopy exception:  " + e);
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_iterator_basic() {
        try {
            SLL<String> list = TestMethods.makeSLL(abc);
            SLL_Iterator<String> iter = new SLL_Iterator<>(list);
            Assert.assertTrue("^ABC hasNext", iter.hasNext());
            Assert.assertTrue("^ABC next == A", iter.next().equals("A"));
            Assert.assertTrue("A^BC hasNext", iter.hasNext());
            Assert.assertTrue("A^BC next == B", iter.next().equals("B"));
            Assert.assertTrue("AB^C hasNext", iter.hasNext());
            Assert.assertTrue("AB^C next == A", iter.next().equals("C"));
            Assert.assertTrue("ABC^ !hasNext", !iter.hasNext());
            list = TestMethods.makeSLL(empty);
            iter = new SLL_Iterator<String>(list);
            Assert.assertTrue("^empty hasNext", !iter.hasNext());
        } catch (Exception e) {
            Assert.fail("Test next exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_iterator_set() {
        try {
            SLL<String> list = TestMethods.makeSLL(empty);
            SLL_Iterator<String> iter = new SLL_Iterator<>(list);
            Assert.assertThrows("exception on initial set",
                    MissingElementException.class,
                    () -> {
                        iter.set("D");
                    });
            list = TestMethods.makeSLL(abc);
            SLL_Iterator<String> iter1 = new SLL_Iterator<>(list);
            iter1.next();
            iter1.set("D");
            String s = TestMethods.verifySLL(list, dbc);
            Assert.assertTrue("A^BC.set(D)->DBC" + s, s.equals(""));
            iter1.next();
            iter1.set("A");
            s = TestMethods.verifySLL(list, dac);
            Assert.assertTrue("D^BC.set(A)->DAC" + s, s.equals(""));
            iter1.set("E");
            s = TestMethods.verifySLL(list, dec);
            Assert.assertTrue("D^AC.set(E)->DEC" + s, s.equals(""));
            iter1.next();
            iter1.set("F");
            s = TestMethods.verifySLL(list, def);
            Assert.assertTrue("DE^C.set(F)->DEF" + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test set exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_iterator_add() {
        try {
            SLL<String> list = TestMethods.makeSLL(empty);
            SLL_Iterator<String> iter = new SLL_Iterator<>(list);
            iter.add("A");
            String s = TestMethods.verifySLL(list, a);
            Assert.assertTrue("empty.add(A)->A" + s, s.equals(""));
            iter.add("B");
            s = TestMethods.verifySLL(list, ab);
            Assert.assertTrue("A^.add(B)->AB" + s, s.equals(""));
            list = TestMethods.makeSLL(bac);
            iter = new SLL_Iterator<>(list);
            iter.add("D");
            s = TestMethods.verifySLL(list, dbac);
            Assert.assertTrue("^BAC.add(D)->DBAC" + s, s.equals(""));
            iter.add("E");
            s = TestMethods.verifySLL(list, debac);
            Assert.assertTrue("D^BAC.add(E)->DEBAC" + s, s.equals(""));
            iter.next();
            iter.next();
            iter.next();
            iter.add("F");
            iter.add("G");
            s = TestMethods.verifySLL(list, debacfg);
            Assert.assertTrue("DEBAC^.add(F).add(G)->DEBACFG" + s, s.equals(""));
            list = TestMethods.makeSLL(abc);
            iter = new SLL_Iterator<>(list);
            iter.next();
            iter.next();
            iter.add("D");
            s = TestMethods.verifySLL(list, abdc);
            Assert.assertTrue("AB^C.add(D)->ABDC" + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test set exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

    @Test
    public void test_iterator_remove() {
        try {
            SLL<String> list = TestMethods.makeSLL(empty);
            SLL_Iterator<String> iter = new SLL_Iterator<>(list);
            Assert.assertThrows("exception on empty remove",
                    MissingElementException.class,
                    () -> {
                        iter.remove();
                    });
            list = TestMethods.makeSLL(bac);
            SLL_Iterator<String> iter2 = new SLL_Iterator<>(list);
            Assert.assertThrows("exception on initial remove",
                    MissingElementException.class,
                    () -> {
                        iter2.remove();
                    });
            iter2.next();
            iter2.remove();
            String s = TestMethods.verifySLL(list, ac);
            Assert.assertTrue("B^AC.remove->AC" + s, s.equals(""));
            Assert.assertThrows("exception on second remove",
                    MissingElementException.class,
                    () -> {
                        iter2.remove();
                    });
            iter2.next();
            iter2.next();
            iter2.remove();
            s = TestMethods.verifySLL(list, a);
            Assert.assertTrue("AC^.remove->A" + s, s.equals(""));
            SLL_Iterator<String> iter3 = new SLL_Iterator<>(list);
            iter3.next();
            iter3.remove();
            s = TestMethods.verifySLL(list, empty);
            Assert.assertTrue("A^.remove->empty" + s, s.equals(""));
        } catch (Exception e) {
            Assert.fail("Test set exception:  " + e);
            e.printStackTrace();
        } catch (NoSuchMethodError e) {
            Assert.fail("Test missing method:  " + e);
        }
    }

}