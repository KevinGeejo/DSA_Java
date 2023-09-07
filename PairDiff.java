public class PairDiff {
    public static void main(String[] args) {

    }
    static int findPair(int[] arr, int n){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            //find middle element
//            int mid = (start + end)/2;
            int mid = start + (end-start)/2;
            if(n<arr[mid]){
                end = mid - 1;
            } else if (n>arr[mid]) {
                start = mid + 1;

            }
            else{
                return mid;
            }


        }
        return -1;
    }
}
