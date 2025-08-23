public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,3};

        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.print("Result: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
