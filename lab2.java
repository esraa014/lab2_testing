public class lab2 {
    // Function to check even or odd.
    public static String evenOrOdd(double x) {

        if ((x % 2) == 0)
            return "even";
        else return "odd";

    }


    public static int getMaxValue(int[] array) {
        int value = 0;

        if (array.length <= 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                value = array[i];
            }
        }
        return value;
    }

    public static int getMinValue(int[] array) {
        int value = Integer.MAX_VALUE;

        if (array.length <= 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
            }
        }
        return value;

    }


}
