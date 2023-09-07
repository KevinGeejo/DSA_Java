import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }



    // USE CYCLIC sort when range of numbers = 1 to N
    static void cyclesort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap( arr,  i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
