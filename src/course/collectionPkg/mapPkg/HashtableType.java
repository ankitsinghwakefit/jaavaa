package course.collectionPkg.mapPkg;

import java.util.Hashtable;
import java.util.Map;

public class HashtableType {
    // it's totally similar to HashMap only diff is that it is synchronized but
    // hashmap is not
    public static void main(String[] args) {
        Hashtable<String, String> myhash = new Hashtable<>();
        myhash.put("IN", "India");
        myhash.put("US", "United States");
        myhash.put("CA", "Canada");
        // myhash.put(null, "United States"); // null is not allowed here
        for (Map.Entry<String, String> map : myhash.entrySet()) {
            System.out.println(map.getKey() + ":" + map.getValue());
        }
    }
}
