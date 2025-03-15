package array;
public class SecondMax {
    int findSecondMax(int[] arr) {
        int max= Integer.MIN_VALUE;
        int secondmax= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max) {
                secondmax=arr[i];
            }
        }
        return secondmax;
    }
public static void main(String[] args) {
    int[] arr = {5,6,7,8,2,10,15};
    SecondMax sm = new SecondMax();
    System.out.println(sm.findSecondMax(arr));
}
}
