package array;
public class ReverseArray {
    public static void reverse(int[] numbers, int start,int end) {
        while(start<end) {
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
     }


public static void printArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public static void main(String[] args) {
    int[] numbers = {5,6,8,9,2};
    ReverseArray.reverse(numbers, 0 ,numbers.length-1);
    printArray(numbers);
    
}
}