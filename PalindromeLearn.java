public class PalindromeLearn {

    public static boolean Ispalindrome(String str){
                                            // NAIVE APPROACH FOR PLAINDROME //


//        String rev = "";
//        boolean ans = false;
//
//        for (int i = str.length()-1; i >=0 ; i--) {
//            rev = rev + str.charAt(i);
//        }
//        if(str.equals(rev)){
//            ans = true;
//
//        }
//        return ans;



                                                    // TWO POINTER METHOD //

       int i = 0;
       int j = str.length()-1;
       str = str.toLowerCase();
       boolean ans = true;
       while(i<j){
           if(str.charAt(i) != str.charAt(j)){
               return ans = false;
           }
           i++;
           j--;
       }
        return ans;
    }



    public static void main(String[] args) {
        String str = "Racecar";
        System.out.println(Ispalindrome(str));
    }
}
