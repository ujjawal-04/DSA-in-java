package array;
public class moveZeros {
    public void zeros(int[] arr, int n) {
        int j = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; 
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 5, 6, 0, 8, 0, 7, 0, 1, 2, 3};
        int n = arr.length;

        moveZeros mz = new moveZeros();
        System.out.print("Original array: ");
        printArray(arr);

        mz.zeros(arr, n); 

        System.out.print("Array after moving zeros: ");
        printArray(arr);
    }
}
