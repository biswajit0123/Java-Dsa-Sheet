

public class Binary_String{

static void printBinaryString(int n, String str,int lastchar ){

    if(n == 0){
        System.out.println(str);
        return;
    }

    printBinaryString(n-1, str + "0", 0);
    if(lastchar == 0){
        printBinaryString(n-1, str + "1", 1);
    }
}
public static void main(String[] args){
    printBinaryString(3, "", 0);
}
}