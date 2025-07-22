   import java.lang.Math;
    public class Traping_rainwater{

   static int tappedRainwater(int[] height){
    int n = height.length;
       //calculate left max bar
       int[] maxleftbar = new int[n];
       maxleftbar[0] = height[0];

       for(int i=1; i< n; i++){
        maxleftbar[i] = Math.max(maxleftbar[i-1], height[i]);
       }
       //calculate right max bar
       int[] rightmaxbar = new int[n];
       rightmaxbar[n-1] = height[n-1];
     
       for(int i=n-2; i>=0; i--){
        rightmaxbar[i] = Math.max(rightmaxbar[i+1], height[i]);
       } 
       int waterLevel = 0;
       int TrapedWater = 0;
       for(int i =0; i< n; i++){
       //waterlevel = min(leftmaxbar[i], rightmaxbar[i]) 
        waterLevel =Math.min(maxleftbar[i], rightmaxbar[i]);
      //trapedWater = trapedWater + waterLevel - heigth[i]
           TrapedWater += waterLevel - height[i];
       }
       
       return TrapedWater;
   }
        public static void main(String[] args){
              int height[] = {4,2,0,6,3,2,5};
              System.out.println(tappedRainwater(height));
        }
    }