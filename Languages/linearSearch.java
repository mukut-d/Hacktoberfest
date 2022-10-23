package dsa;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums ={1,21,22,45,76,-9,-052};
        int target = 45;
        int ans= linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int t){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            int element=arr[i];
            if(element==t){
                return i+1;
            }
        }
        return -1;
    }
}
