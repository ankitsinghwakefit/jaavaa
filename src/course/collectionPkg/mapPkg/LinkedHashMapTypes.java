package course.collectionPkg.mapPkg;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTypes {
    // it will maintain order
    // it is slower than Hashmap
    public static void main(String[] args) {
        LinkedHashMap<String, String> myLink = new LinkedHashMap<>();
        myLink.put("IN", "India");
        myLink.put("CA", "Canada");
        for (Map.Entry<String, String> map : myLink.entrySet()) {
            System.out.println(map.getKey());
        }
    }
}
