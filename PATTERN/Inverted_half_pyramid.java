public class Inverted_half_pyramid {
    public static void main(String[] args){

       int row = 4;
       
       for(int i = 1; i<= row; i++) {
         //print space
         for(int space = 1; space <= row - i; space++){
            System.out.print(" ");
         }

         for(int j=1; j <= i; j++){
            System.out.print("*");
       }

       System.out.println();
    }
}
}