
// https://leetcode.com/problems/string-compression/description/

import java.util.ArrayList;
import java.util.List;

public class String_Compression{

static int stringCompression(char[] arr){
    List<Character> list = new ArrayList<>();

    Integer count = 1;
    list.add(arr[0]);
    char prev = arr[0];

    for(int i=1; i<arr.length; i++){
        if(prev == arr[i] ){
            count++;
            if(i == arr.length -1){
                  String ct = count.toString();
            for(int j =0; j<ct.length(); j++){
                char n = ct.charAt(j);
               list.add(n);
            }
            }
        }else{

            // list.append(char[i]);
            String ct = count.toString();
            for(int j =0; j<ct.length(); j++){
                char n = ct.charAt(j);
               list.add(n);
            }
            
            list.add(arr[i]);
            count = 1;
            prev = arr[i];
        }
    }
  System.out.println(list);
    return list.size();
}

static void compres2(String str){

String newstr= "";
    for(int i=0; i< str.length(); i++){
        Integer count = 1;
        while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            i++;
            count++;
        }
     newstr += str.charAt(i);
     if(count > 1){
        newstr += count.toString();
     }
        
    }
    System.out.println(newstr );
}

    public static void main(String[] args){
       char[] arr = {'a','a','b','b','c','c','c'};
       System.out.println(stringCompression(arr));
        compres2("aabbcc");
    }
}