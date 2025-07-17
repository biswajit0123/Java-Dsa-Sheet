public class Hollow_Rhombus {
    public static void main(String[] args) {

        int n = 5;

        for (int i =1; i<= n; i++){

            //space
            for (int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            //holoow rectangle

            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
