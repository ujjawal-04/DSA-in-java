public class sortedSquares {

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] SortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int i = 0;
        int j = n-1;
        for(int k = n-1;k>=0 ;k--) {
             if(Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[k] = arr[i]*arr[i];
                i++;
             } else {
                result[k] = arr[j]*arr[j];
                j--;
             }
        } 
        return result;
    }

    public void arrayDemo() {
        int[] arr = {-4,-1,0,3,10};
        printArray(arr);
        int[] result = SortedSquares(arr);
        printArray(result);
    }

    public static void main(String[] args) {
        sortedSquares ss = new sortedSquares();
        ss.arrayDemo();
    }
}