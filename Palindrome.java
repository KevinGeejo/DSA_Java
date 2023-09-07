
//Given an integer x, return true if x is a
//palindrome
//, and false otherwise.

class Solution {
    public boolean isPalindrome(int x){
        String s = String.valueOf(x);

        int n = s.length();
        for(int i = 0; i< n/2;i++){
            if(s.charAt(i)!= s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

}

public class Palindrome{
    public static void main(String[] args) {
        int x = 669966;
        Solution solution = new Solution();
        boolean Ispalin = solution.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + Ispalin);
    }
}