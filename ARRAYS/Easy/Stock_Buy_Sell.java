public class Stock_Buy_Sell{

   static int buyAndSellStock(int[] prices){
    int n = prices.length;
    int bp = Integer.MAX_VALUE;
    int sp = 0;
    int maxProfit = 0;

    for(int i =1; i <n; i++){
        sp = prices[i];
        bp = Math.min(bp, prices[i-1]);
        int profit = sp - bp;

        maxProfit = profit > maxProfit ? profit :maxProfit;
    }
 return maxProfit;
   }

    public static void main(String[] args){
      int[] prices = {7,1,5,3,6,4};
      System.out.println(buyAndSellStock(prices));
    }
}