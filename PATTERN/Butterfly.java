public class Butterfly {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 0; i<= n; i++){

            //start
            for(int start=1; start<=i; start++){
                System.out.print("*");
            }

            //space

            for(int space = 1; space <= (n-i) * 2; space++){
                System.out.print(" ");
            }

            //startt
            for(int start=1; start<=i; start++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i>=1; i--){

            //start
            for(int start=1; start<=i; start++){
                System.out.print("*");
            }

            //space

            for(int space = 1; space <= (n-i) * 2; space++){
                System.out.print(" ");
            }

            //startt
            for(int start=1; start<=i; start++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
