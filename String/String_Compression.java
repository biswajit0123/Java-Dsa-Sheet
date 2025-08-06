
// https://leetcode.com/problems/string-compression/description/

import java.util.ArrayList;
import java.util.List;

public class String_Compression{

static int stringCompression(String[] arr){
    List<String> list = new ArrayList<>();

    Integer count = 1;
    list.add(arr[0]);
    String prev = arr[0];

    for(int i=1; i<arr.length; i++){
        if(prev == arr[i] ){
            count++;
            if(i == arr.length -1){
                  String ct = count.toString();
            for(int j =0; j<ct.length(); j++){
                String n = new String(String.valueOf(ct.charAt(j)));
               list.add(n);
            }
            }
        }else{

            // list.append(char[i]);
            String ct = count.toString();
            for(int j =0; j<ct.length(); j++){
                String n = new String(String.valueOf(ct.charAt(j)));
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
    public static void main(String[] args){
       String[] arr = {"a","a","b","b","c","c"};
       System.out.println(stringCompression(arr));
    }
}