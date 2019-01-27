package jet.thirtydaysofcode;

public class Day27 {
    static class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
            return new int[]{};
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            // complete this function
            return new int[]{1, 2};
        }

        public static int get_expected_result() {
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            return new int[]{1, 1, 2};
        }

        public static int get_expected_result() {
            return 0;
        }
    }
}
