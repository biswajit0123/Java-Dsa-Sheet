public class Solid_Rhombus {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;

        for (int i =1; i<= row; i++){

            //spaces
            for (int space=1; space <= row-i;space++){
                System.out.print(" ");
            }

            //start
            for (int star =1; star <= col; star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
