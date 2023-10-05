import org.junit.*;

/**
 * This class is designed to use with JUnit at the
 * command line. It catches errors and prints a
 * message for each test, whether passed or failed.
 */
public class Assert {
    /** Asserts that two boolean arrays are equal. */
    static void assertArrayEquals(boolean[] expecteds, boolean[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two byte arrays are equal. */
    static void assertArrayEquals(byte[] expecteds, byte[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two char arrays are equal. */
    static void assertArrayEquals(char[] expecteds, char[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two double arrays are equal. */
    static void assertArrayEquals(double[] expecteds, double[] actuals, double delta) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals, delta);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two float arrays are equal. */
    static void assertArrayEquals(float[] expecteds, float[] actuals, float delta) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals, delta);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two int arrays are equal. */
    static void assertArrayEquals(int[] expecteds, int[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two long arrays are equal. */
    static void assertArrayEquals(long[] expecteds, long[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two object arrays are equal. */
    static void assertArrayEquals(Object[] expecteds, Object[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two short arrays are equal. */
    static void assertArrayEquals(short[] expecteds, short[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two boolean arrays are equal. */
    static void assertArrayEquals(String message, boolean[] expecteds, boolean[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two byte arrays are equal. */
    static void assertArrayEquals(String message, byte[] expecteds, byte[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two char arrays are equal. */
    static void assertArrayEquals(String message, char[] expecteds, char[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two double arrays are equal. */
    static void assertArrayEquals(String message, double[] expecteds, double[] actuals, double delta) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals, delta);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two float arrays are equal. */
    static void assertArrayEquals(String message, float[] expecteds, float[] actuals, float delta) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals, delta);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two int arrays are equal. */
    static void assertArrayEquals(String message, int[] expecteds, int[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two long arrays are equal. */
    static void assertArrayEquals(String message, long[] expecteds, long[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two object arrays are equal. */
    static void assertArrayEquals(String message, Object[] expecteds, Object[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two short arrays are equal. */
    static void assertArrayEquals(String message, short[] expecteds, short[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /**
     * Deprecated. Use assertEquals(double expected, double actual, double delta)
     * instead
     */
    @SuppressWarnings("deprecation")
    static void assertEquals(double expected, double actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two doubles are equal to within a positive delta. */
    static void assertEquals(double expected, double actual, double delta) {
        try {
            org.junit.Assert.assertEquals(expected, actual, delta);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two floats are equal to within a positive delta. */
    static void assertEquals(float expected, float actual, float delta) {
        try {
            org.junit.Assert.assertEquals(expected, actual, delta);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two longs are equal. */
    static void assertEquals(long expected, long actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Deprecated. use assertArrayEquals */
    @SuppressWarnings("deprecation")
    static void assertEquals(Object[] expecteds, Object[] actuals) {
        try {
            org.junit.Assert.assertEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two objects are equal. */
    static void assertEquals(Object expected, Object actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /**
     * Deprecated. Use assertEquals(String message, double expected, double actual,
     * double delta) instead
     */
    @SuppressWarnings("deprecation")
    static void assertEquals(String message, double expected, double actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two doubles are equal to within a positive delta. */
    static void assertEquals(String message, double expected, double actual, double delta) {
        try {
            org.junit.Assert.assertEquals(expected, actual, delta);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two floats are equal to within a positive delta. */
    static void assertEquals(String message, float expected, float actual, float delta) {
        try {
            org.junit.Assert.assertEquals(expected, actual, delta);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two longs are equal. */
    static void assertEquals(String message, long expected, long actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Deprecated. use assertArrayEquals */
    @SuppressWarnings("deprecation")
    static void assertEquals(String message, Object[] expecteds, Object[] actuals) {
        try {
            org.junit.Assert.assertEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two objects are equal. */
    static void assertEquals(String message, Object expected, Object actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that a condition is false. */
    static void assertFalse(boolean condition) {
        try {
            org.junit.Assert.assertFalse(condition);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that a condition is false. */
    static void assertFalse(String message, boolean condition) {
        try {
            org.junit.Assert.assertFalse(condition);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two doubles are not equal to within a positive delta. */
    static void assertNotEquals(double unexpected, double actual, double delta) {
        try {
            org.junit.Assert.assertNotEquals(unexpected, actual, delta);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two floats are not equal to within a positive delta. */
    static void assertNotEquals(float unexpected, float actual, float delta) {
        try {
            org.junit.Assert.assertNotEquals(unexpected, actual, delta);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two longs are not equals. */
    static void assertNotEquals(long unexpected, long actual) {
        try {
            org.junit.Assert.assertNotEquals(unexpected, actual);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two objects are not equals. */
    static void assertNotEquals(Object unexpected, Object actual) {
        try {
            org.junit.Assert.assertNotEquals(unexpected, actual);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two doubles are not equal to within a positive delta. */
    static void assertNotEquals(String message, double unexpected, double actual, double delta) {
        try {
            org.junit.Assert.assertNotEquals(unexpected, actual, delta);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two floats are not equal to within a positive delta. */
    static void assertNotEquals(String message, float unexpected, float actual, float delta) {
        try {
            org.junit.Assert.assertNotEquals(unexpected, actual, delta);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two longs are not equals. */
    static void assertNotEquals(String message, long unexpected, long actual) {
        try {
            org.junit.Assert.assertNotEquals(unexpected, actual);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two objects are not equals. */
    static void assertNotEquals(String message, Object unexpected, Object actual) {
        try {
            org.junit.Assert.assertNotEquals(unexpected, actual);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that an object isn't null. */
    static void assertNotNull(Object object) {
        try {
            org.junit.Assert.assertNotNull(object);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that an object isn't null. */
    static void assertNotNull(String message, Object object) {
        try {
            org.junit.Assert.assertNotNull(object);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two objects do not refer to the same object. */
    static void assertNotSame(Object unexpected, Object actual) {
        try {
            org.junit.Assert.assertNotSame(unexpected, actual);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two objects do not refer to the same object. */
    static void assertNotSame(String message, Object unexpected, Object actual) {
        try {
            org.junit.Assert.assertNotSame(unexpected, actual);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that an object is null. */
    static void assertNull(Object object) {
        try {
            org.junit.Assert.assertNull(object);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that an object is null. */
    static void assertNull(String message, Object object) {
        try {
            org.junit.Assert.assertNotNull(object);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two objects refer to the same object. */
    static void assertSame(Object expected, Object actual) {
        try {
            org.junit.Assert.assertSame(expected, actual);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two objects refer to the same object. */
    static void assertSame(String message, Object expected, Object actual) {
        try {
            org.junit.Assert.assertSame(expected, actual);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /**
     * Asserts that runnable throws an exception of type expectedThrowable when
     * executed.
     */
    static <T extends Throwable> T assertThrows(Class<T> expectedThrowable,
            org.junit.function.ThrowingRunnable runnable) {
        T result = null;
        try {
            result = org.junit.Assert.assertThrows(expectedThrowable, runnable);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
        return result;
    }

    /**
     * Asserts that runnable throws an exception of type expectedThrowable when
     * executed.
     */
    static <T extends Throwable> T assertThrows(String message, Class<T> expectedThrowable,
            org.junit.function.ThrowingRunnable runnable) {
        T result = null;
        try {
            result = org.junit.Assert.assertThrows(expectedThrowable, runnable);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
        return result;
    }

    /** Asserts that a condition is true. */
    static void assertTrue(boolean condition) {
        try {
            org.junit.Assert.assertTrue(condition);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that a condition is true. */
    static void assertTrue(String message, boolean condition) {
        try {
            org.junit.Assert.assertTrue(condition);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Fails a test with no message. */
    static void fail() {
        try {
            org.junit.Assert.fail();
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Fails a test with the given message. */
    static void fail(String message) {
        try {
            org.junit.Assert.fail(message);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

}