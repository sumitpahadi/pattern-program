public class star_pattern8 {
    static  void pattern(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==0 && i==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern();

    }
}
