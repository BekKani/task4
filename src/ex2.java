public class ex2 {

    public static void main(String[] args) {
        System.out.println("The sum of the numbers in the arrays is: " +
                calcSumArray(new int[]{0, 1, 2, 3, 4}));
    }

    public static int calcSumArray(int[] arr) {
        int result = 0;
        // we should start the loop from index 0.
        for (int i = 0; i < arr.length; i++) {
            // result-should be the first element of the array
            result += arr[i];
        }
        return result;
    }
}
