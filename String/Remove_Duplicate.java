

public class Remove_Duplicate{
    
    public static String removeDuplicates(String str, int idx, StringBuilder ans,boolean[] map ){
        
        if(idx == str.length()){
            return ans.toString();
        }
        if(str.charAt(idx) == ' '){
            ans.append(' ');
            return removeDuplicates(str, idx + 1, ans, map);
        }
        if(map[ (str.charAt(idx) - 'a')] == true){
            return removeDuplicates(str, idx + 1, ans, map);
        }else{
            ans.append(str.charAt(idx));
            map[ (str.charAt(idx) - 'a') ] = true;
            return removeDuplicates(str, idx + 1, ans, map);
        }

    }

    public static void main(String[] args){
        String str = "quick brown fox jumps over the lazy ";
        String result = removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
        System.out.println("String after removing duplicates: " + result);
    }
}