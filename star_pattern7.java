public class star_pattern7 {
   static  void pattern(int n){
       for (int i = 0; i <=n ; i++) {
           for (int j = 0; j <=i ; j++) {
               System.out.print("  ");

           }
           for (int k = n; k >=i ; k--) {
               System.out.print(" *");

           }
           for (int m = n; m >i ; m--) {
               System.out.print(" *");

           }
           System.out.println();

       }
   }
    public static void main(String[] args) {
        pattern(5);


    }
}
//            * * * * * * * * * *
//             * * * * * * * * *
//              * * * * * * *
//               * * * * *
//                 * * *
//                   *
