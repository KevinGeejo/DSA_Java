//Largest Sum Contiguous Subarray (Kadane’s Algorithm)

//https://www.youtube.com/watch?v=HCL4_bOd3-4


public class Kadane{
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("The largest sum subarray is " + maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[]){
        int current_sum = 0;
        int max_sum = 0;

        for(int i=0;i<a.length;i++){
            current_sum = a[i] + current_sum;
            if(max_sum<current_sum){
                max_sum = current_sum;
            }
            if(current_sum<0){
                current_sum = 0;

            }
        }
        return max_sum;
    }

}
