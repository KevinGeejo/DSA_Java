public class IsPalindromeNumber {
        public static boolean isPalindrome(int x){
            int temp = x;
            int rev = 0;
            while(x>0){

                int digit = x % 10;
                rev = (rev *10) + digit;
                x = x/10;
            }
            if( temp == rev){
                return true;
            }
            else{
                return false;
            }
        }

    public static void main(String[] args) {
        int x = 1221;
        boolean ans = isPalindrome(x);
        System.out.println(ans);
    }
    }
