public class GCD {

    // Function to return gcd of a and b
    public static int gcd(int a, int b) {
        int result = Math.min(a, b);
        while(result>0){
            if(a % result == 0 && b % result == 0){
                break;
            }
            result--;
        }
        return result;
    }

    static int lcm(int a, int b){
        return (a/gcd(a,b))*b;
    }
    // Driver code
    public static void main(String[] args)
    {
        int a = 10, b = 20;
        System.out.print("GCD/HCF of " + a + " and " + b
                + " is " + gcd(a, b));
    }
}