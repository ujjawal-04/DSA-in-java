package searching;
public class searchInsetPosition {

        public int searchInsetPositionsearch(int[] nums,int target) {
            int low = 0;
            int high = nums.length - 1;
            while(low <= high) {
             int mid = low + (high - low)/2;
             if(nums[mid] ==  target) return mid;
             if(target < nums[mid]) {
                high = mid -1;
             } else {
                low = mid +1;
             }
            }
            return low;
        }
    
        public static void main(String[] args) {
            int[] arr = {1,3,5,7,8};
             searchInsetPosition sip = new searchInsetPosition();
                System.out.println(sip.searchInsetPositionsearch(arr, 3));
                System.out.println(sip.searchInsetPositionsearch(arr,  6));
        }
        
}
