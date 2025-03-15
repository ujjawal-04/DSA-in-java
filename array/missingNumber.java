package array;
public class missingNumber {
    int number(int[] arr) {
     int n = arr.length+1;
     int sum = n*(n+1)/2;
     for(int num : arr) {
        sum = sum - num;
     }
     return sum;
    }
public static void main(String[] args) {
    int [] arr = {1,2,5,6,4};
    missingNumber mn = new missingNumber();
    System.out.println(mn.number(arr));
}
}
