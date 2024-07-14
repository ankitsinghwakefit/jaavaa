package course.collectionPkg.mapPkg;

import java.util.HashMap;
import java.util.Map;

public class HashMapType {
    // key value pairs it an object
    // un-ordered and un-sorted
    public static void main(String[] args) {
        HashMap<String, String> myObj = new HashMap<>();
        myObj.put("IN", "India");
        // IN key will be sent to hash function and besed upton hashcode this key value
        // pair will be stored in bucket
        myObj.put("US", "United states");
        myObj.put("CA", "Canada");
        myObj.put(null, "null value"); // null is allowed to store
        myObj.put("CA", "edited canada"); // it will over ride value
        System.out.println(myObj);
        System.out.println(myObj.get("IN"));
        // to get IN key will be sent to hash function and besed upton hashcode this key
        // value pair will be taken out from the bucket
        for (Map.Entry<String, String> map : myObj.entrySet()) {
            // to iterate over objects we have to get entrySet
            System.out.println(map.getKey() + ":" + map.getValue());
        }
    }
}
