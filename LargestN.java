import java.util.Arrays;
import java.util.Scanner;


// Write a program to find the nth largest and nth smallest item in the array and print them in the same line.
public class LargestN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[]= new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(arr[n-1] + " " + arr[m-n]);

    }
}
