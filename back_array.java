public class BackArray {
    public static void Rev(int[] arr, int i) {
        if (i >= arr.length) return; // base case
        arr[i] = arr[i] - 2;
        Rev(arr, i + 1); // recursive call
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25}; // initialized with values

        Rev(arr, 0); // start recursion from index 0

        // Print updated array
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
