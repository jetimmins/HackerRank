package jet.hackerrank.thirtydaysofcode;

public class Day14 {
    class Difference {
        private int[] elements;
        public int maximumDifference;
        // Add your code here
        public Difference(int[] elements) {
            this.elements = elements;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        public void computeDifference() {
            for (int element : elements) {
                if (element < min) {
                    min = element;
                }
                if (element > max) {
                    max = element;
                }
            }
            maximumDifference = max - min;
        }
    }
}
