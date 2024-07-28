package course.streamPkg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachPractice {
    public static void main(String[] args) {
        // Map<String, Integer> nameWithAge = new HashMap<String, Integer>();
        // nameWithAge.put("Larry", 25);
        // nameWithAge.put("Moe", 30);
        // nameWithAge.put("Curly", 35);
        // String name = nameWithAge.keySet();
        // for(Map<String, Integer> name : nameWithAge){
        // System.out.println(name.getKey() + ":" + name.getValue());
        // }
        List<String> names = Arrays.asList("Larry", "Moe", "Curly");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        nums.forEach(n -> System.out.println(n));
        names.forEach(name -> System.out.println(name));
        int doubleOfN = nums.stream()
                .filter(n -> n > 5)
                .map(n -> n * 2)
                .reduce(0, (a, b) -> a + b);
        System.out.println(doubleOfN);
    }
}
