public class star_pattern4 {
    static  void pattern(int n){
        for (int i = 0; i<=n ; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k<=i ; k++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }


    }
    public static void main(String[] args) {
        pattern(5);

    }
}
//       *
//      **
//     ***
//    ****
//   *****
