public class GOTN {
    public static void main(String[] args) {
        int a , b ,c , min;
        a = 10;
        b= 14;
        c= 9;

        min = (a<b) ? (a<c ? a:c) : (b<c ? b : c);
        System.out.println(min);
    }
}
