

public class Subset{


static void findSubset(String str, String ans, int i){

 if(i == str.length()){
    System.out.println(ans);
    return;
 }

    //recuirsion
    findSubset(str,  ans+str.charAt(i), i+1);
    findSubset(str, ans, i+1);
}
    public static void  main(String[] a){

        String str = "abc";
        findSubset(str, "", 0);
    }
}