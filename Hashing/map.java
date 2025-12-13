import java.util.*;
public class map {
    
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("india", 100);
        map.put("china", 102);
        map.put("usa", 122);

        System.out.println(map);
        System.out.println(map.get("usa"));
        System.out.println(map.containsKey("inida"));
        
        //remove
        System.out.println(map.remove("china"));

        //isEmpty size
        System.out.println(map.size());
         // map.clear();
        System.out.println(map.isEmpty());

        //iteration
        Set<String> keys = map.keySet();
        for(String s : keys){
            System.out.println(s + map.get(s));
        }

        //or using entryset
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
