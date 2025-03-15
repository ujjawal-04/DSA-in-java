package array;
public class MinimumArray {
    public  int minimum(int[] arr) {
        if(arr==null || arr.length==0) {
            throw new IllegalArgumentException("input array is empty");
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr ={5,6,8,9,2};
        MinimumArray ma = new MinimumArray();
        System.out.println((ma.minimum(arr)));
    }
}
