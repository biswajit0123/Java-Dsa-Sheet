
public class Activity_Selection {


    public static void main(String[] args) {
        int start[] ={1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
//remeber end sholud be sorted
        int activity = 0;
    
        //i have select 1st activity so activity = 1
        activity = 1;
        int lastEnd = 2;
        for(int i =1; i < start.length; i++){
            if(start[i] >= lastEnd){
                activity++;
                lastEnd = end[i];
            }
        }
        System.out.println(activity);
    }
}
