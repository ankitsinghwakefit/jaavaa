package course.optionalClassPkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Index {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ankit", "mayur", "dhin");
        String name = names.stream().filter(nam -> nam.contains("a")).findFirst().orElse("not Found");
        System.out.println(name);
        List<String> caps = Arrays.asList();
        // toList will convert stream to list
        caps = names.stream().map(n -> n.toUpperCase()).toList();
        // or
        // Method refrence example > write method belongs to which class and method name
        caps = names.stream().map(String::toUpperCase).toList();
        caps.forEach(System.out::println);
        System.out.println(caps);
    }
}
