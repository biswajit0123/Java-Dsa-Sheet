

public class Permutation{


static void findPermutation(String str, String ans){

    //base 
   if(str.length() == 0 ){

    System.out.println(ans);
    return;
   }

    //recuirsion
     for(int i =0; i< str.length(); i++){

        char ch = str.charAt(i);
        String remain = str.substring(0,i)+str.substring(i+1, str.length());
        findPermutation(remain, ans+ch);
     }
     
}
    public static void  main(String[] a){

        String str = "abc";
        findPermutation(str, "");
    }
}