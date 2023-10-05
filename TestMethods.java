public class TestMethods {
    public static <T> SLL<T> makeSLL(T[] arr) {
        SLL<T> list = new SLL<T>();
        int i = arr.length;
        while (i > 0) {
            i--;
            list.addFirst(arr[i]);
        }
        return list;
    }

    public static <T> String verifySLL(SLL<T> list, T[] values) {
        String result = "";
        NodeSL<T> here = list.getHead();
        for (int i = 0; i < values.length; i++) {
            if (!((here != null) && (values[i] == here.getData()))) {
                result += "element " + i + "; ";
            }
            if (here == null) {
                break; // list unexpectedly ended early
            }
            here = here.getNext();
        }
        if (here != null) {
            result += "tail";
        }
        if (!result.equals("")) {
            result = " problems at " + result;
        }
        return result;
    }

    public static void phase1tests(SLLTest t) {
        // phase 1 tests
        System.out.println("\nSLL Phase 1 tests:");
        t.check_methods();
        t.test_addFirst_1();
        t.test_addFirst_2();
        t.test_addFirst_3();
        t.test_toString();
        System.out.println("Phase 1 SLL testing complete.");
    }

    public static void phase2tests(SLLTest t) {
        // phase 2 tests
        System.out.println("\nSLL Phase 2 tests:");
        t.test_removeFirst();
        t.test_addLast();
        t.test_removeLast();
        t.test_size();
        t.test_addAfter();
        t.test_removeAfter();
        System.out.println("Phase 2 SLL testing complete.");
    }

    public static void phase3tests(SLLTest t) {
        // phase 3 tests
        System.out.println("\nSLL Phase 3 tests:");
        t.test_copy_constructor();
        t.test_subseqByCopy();
        t.test_spliceByCopy();
        t.test_subseqByTransfer();
        t.test_spliceByTransfer();
        System.out.println("Phase 3 SLL testing complete.");
    }

    public static void phase4tests(SLLTest t) {
        // phase 4 tests
        System.out.println("\nSLL Phase 4 tests:");
        t.test_MEE1();
        t.test_MEE2();
        t.test_MEE3();
        t.test_SIE1();
        t.test_SIE2();
        System.out.println("Phase 4 SLL testing complete.");
    }

    public static void phase5tests(SLLTest t) {
        // phase 5 tests
        System.out.println("\nSLL Phase 5 tests:");
        t.test_iterator_basic();
        t.test_iterator_set();
        t.test_iterator_add();
        t.test_iterator_remove();
        System.out.println("Phase 5 SLL testing complete.");
    }

    public static void main(String[] args) {
        SLLTest t = new SLLTest();
        phase1tests(t);
        phase2tests(t);
        phase3tests(t);
        phase4tests(t);
        phase5tests(t);
    }
}
