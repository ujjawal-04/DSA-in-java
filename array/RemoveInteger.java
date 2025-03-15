package array;
public class RemoveInteger {
    public static int[] removeInt(int[] arr) {
        int oddCount = 0;
        
        // Count odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx = 0;

        // Store only odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }

        return result;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 9, 2, 3, 4, 7};

        System.out.print("Original array: ");
        printArray(arr);

        int[] result = removeInt(arr);

        System.out.print("Filtered array (odd numbers only): ");
        printArray(result);
    }
}
