public class star_pattern1 {
    static  void pattern(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print(" *");

            }
            System.out.println(" ");

        }
    }
    public static void main(String[] args) {
        pattern(5);

    }
}
//*****
//****
//***
//**
//*
