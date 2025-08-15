public class  Compute_xpown {
    public static void main(String[] args) {
       int x = 2;
       int n = -1;
       long posn = n < 0 ? -(long)n : (long)n;

       double result = computePower(x, posn);
       if(n < 0){
       System.out.println("Result: " +(long) 1.0/result);

       }else{
       System.out.println("Result: " + result);
        
       }
    }

    public static double computePower(int x, long n) {
       
       if(n== 1){
        return x;
       }
     double halfpow = computePower(x, n/2);
     double pow = halfpow * halfpow;
     if(n % 2 != 0){
        pow = pow * x;
     }
  return pow;
}
}