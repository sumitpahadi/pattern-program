public class star_patter {
    static  void print_pattern(int n){
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print(" *");

            }
            System.out.println(" ");

        }
    }
    public static void main(String[] args) {
        print_pattern(5);

    }
}
//output
//*****
//*****
//*****
//*****
