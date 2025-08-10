
public class Bit_operation{
    public static void main(String[] args){
       
       int n = 15;
        int bitmask =0;
        int pos = 5;
        bitmask = 1 << pos;
        if((n & bitmask) == 0){
          System.out.println(0);
        }else{
          System.out.println(1);
            
        }

        //set bit 
        bitmask = 1 << pos;
      System.out.println(n | bitmask);
        
    }
}