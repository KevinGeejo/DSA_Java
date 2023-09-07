public class Floor {
    public static void main(String[] args) {
    int[] arr = {-18,-10,1,3,5,6,7,8,10,23,56,78};
    int target = 22;
    int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    // return the index

    //function to get the highest number that is less than the target number.
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(target > arr[arr.length-1]){
            return -1;
        }

        while(start<=end){
            //find middle element
//            int mid = (start + end)/2;
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid + 1;

            }
            else{
                return mid;
            }


        }
        return end;
    }
}
