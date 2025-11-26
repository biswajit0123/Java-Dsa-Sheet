// https://leetcode.com/problems/container-with-most-water/description/
public class Most_water {

    //optimal
    static int mostWater2(int[] height){
        int max  = 0;

        int lp = 0;
         int rp = height.length-1;

         while (lp < rp) {
           int minheight = Math.min(height[lp], height[rp]);
           int area = minheight * ( rp - lp);
           max = Math.max(area, max);
           
           if(height[lp] < height[rp]){
            lp++;
           }else{
            rp--;
           }
         }
         return max;
    }
    static int  mostWater(int[] height){

        int max =0;
        for(int i =0; i< height.length-1;i++){
            for(int j=i+1; j< height.length; j++){
                int min = Math.min(height[i], height[j]);
                int contain = (j -i) * min;
             max = Math.max(contain, max);
            } 
        }

        return max;
    }
    public static void main(String[] args) {
        int[] height = {1,8,100,2,100,4,8,3,7};
        int res=mostWater(height);
        System.out.println(res);

        System.out.println(mostWater2(height));
    }
    
}
