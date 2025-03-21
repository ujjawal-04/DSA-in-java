public class binarySearch {

    public int search(int[] nums,int key) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
         int mid = (low + high)/2;
         if(nums[mid] ==  key) return mid;
         if(key < nums[mid]) {
            high = mid -1;
         } else {
            low = mid +1;
         }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,10,20,47,59,65,75,88,99};
         binarySearch bs = new binarySearch();
            System.out.println(bs.search(arr, 54));
            System.out.println(bs.search(arr,  65));
    }
    
}
