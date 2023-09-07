package Leetcode;

import java.util.Arrays;

public class TwoSum {
    public static int[] getValues(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return null;

    }


    public static void main(String[] args) {
        int target = 9;
        int[] arr = {2, 7, 11, 23, 5};
        System.out.println(Arrays.toString(getValues(arr, target)));

    }
}


