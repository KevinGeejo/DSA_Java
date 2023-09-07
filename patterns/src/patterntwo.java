import java.sql.SQLOutput;

public class patterntwo {
    public static void main(String[] args) {
        pattern11(7);
    }


    //DIAMOND SHAPE STAR PATTERN

    static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
        for (int i = 1; i <= n-1 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }




    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
    }}

    //        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
//    static void pattern9(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i+1; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }

    //        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }








    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//                 *
//                 * *
//                 * * *
//                 * * * *
//                 * * * * *
    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



//                    Pattern 4
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *

    static void pattern4(int n){
    for (int i = 1; i <= 2*n; i++) {
        if(i<=n){
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }}
        else{
            for (int j = 2*n; j > i; j--) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

}
}

