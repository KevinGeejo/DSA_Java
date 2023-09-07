public class Seclore {
    public static void main(String[] args) {
        int n = 99;
        Answer(n);
    }
    static void Answer(int n){
        int i = 1;
        while(i<n){
            i = i+1;
            int k = n;
            while(k>=i){
                if (i==k){
                    System.out.println(i);

                }
                k = k -1;
            }
        }
        return;
    }
}
