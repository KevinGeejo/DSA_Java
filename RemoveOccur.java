class GFG{

    static String removeCharRecursive(String str,
                                      char X){
       if(str.length() == 0){
           return "";
       }
       if(str.charAt(0)==X){
           return removeCharRecursive(str.substring(1), X);
       }
       return str.charAt(0) + removeCharRecursive(str.substring(1),X);
    }

    public static void main(String[] args)
    {

        String str = "geeksforgeeks";

        char X = 'e';

        str = removeCharRecursive(str, X);

        System.out.println(str);
    }
}
 