

public class Friends_Pairing{

    static int friendPair(int n){

        if(n == 1 || n == 2){
            return n;
        }

        int single= friendPair(n-1);
        int pair = (n-1) *friendPair(n-2) ;

        return single + pair;
    }
    public static void main(String[] args){
        System.out.println(friendPair(3));
    }
}