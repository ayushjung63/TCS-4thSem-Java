package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name","Ram");
        map.put("faculty","IT");
        System.out.println(map);

        map.put("name","Shyam");
        System.out.println(map);

        String name = map.get("name");
        System.out.println("Name: "+name);

        map.put(null,"Null1");
        map.put(null,"Null2");
        System.out.println(map);


        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+": "+map.get(key));
        }

    }
}
