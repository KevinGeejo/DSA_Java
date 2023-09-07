public class pali {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0 ){
            return true;
        }
        str= str.toLowerCase();
        for (int i = 0; i <= str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }

        }
        return true;
    }
}
