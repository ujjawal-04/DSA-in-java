public class linearSearch {

    public int search(int[] arr, int n,int x) {
        for(int i=0;i<n;i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,1,8,9,4,3,2,7};
         linearSearch ls = new linearSearch();
            System.out.println(ls.search(arr, arr.length, 4));
            System.out.println(ls.search(arr, arr.length, 10));
    }
}