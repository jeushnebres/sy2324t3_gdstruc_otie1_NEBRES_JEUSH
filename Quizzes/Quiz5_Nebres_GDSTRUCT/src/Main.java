public class Main {
    public static int numberSearchBar(int[] arr, int target) {
        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                position = i;
                break;
            }

            if (target < arr[i]) {
                position = i;
                break;
            }
        }

        return position;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 13, 17, 22, 25, 28, 30};
        int target = 30;

        int resultIndex = numberSearchBar(arr, target);

        if (resultIndex != -1) {
            System.out.println("Element found at index " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}