public class mergeSort {

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr, int[] temp, int low, int high) {
        if (low < high) { 
            int mid = low + (high - low) / 2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }

        int i = low, j = mid + 1, k = low;

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) { 
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        while (i <= mid) { 
            arr[k++] = temp[i++];
        }

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
