public class OrderAgnosticBs {
    public static void main(String[] args) {
        int[] arr = {-18, -10, 1, 3, 5, 6, 7, 8, 10, 23, 56, 78};
        int target = 10;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    // return the index
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            //find middle element
//            int mid = (start + end)/2;
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }
        }
        return -1;
    }
}