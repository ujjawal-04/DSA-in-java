package sorting;
public class quickSort {

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr, int low, int high) {
        if (low < high) { 
            int p = partition(arr,low,high);
            sort(arr,low, p - 1);
            sort(arr,p + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = low;
      
        while(i<=high) {
            if(arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j-1;
    }

    public static void main(String[] args) {
        mergeSort ms = new mergeSort();
        int[] arr = {9, 5, 2, 4, 3};

        System.out.println("Original Array:");
        ms.printArray(arr);

        ms.sort(arr, new int[arr.length], 0, arr.length - 1);

        System.out.println("Sorted Array:");
        ms.printArray(arr);
    }
}
