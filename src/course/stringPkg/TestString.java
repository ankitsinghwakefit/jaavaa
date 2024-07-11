package course.stringPkg;

public class TestString {
    public static void main(String[] args) {
        // == used to compare 2 refrences are POINTING to same object or not
        // .equals() used to compare if 2 objects have same CONTENT or not
        String s1 = "hii"; // intern() method is used by default to put this string in the string pool
        String s2 = "hii";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = new String("hii"); // intern() will not be called by default if we want to store i in string pool
                                       // call it
        String s4 = new String("hii");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = "hello";
        s5.concat("there!");
        System.out.println(s5); // no reference thus string will be created and stored in string pool and these
                                // objects will be cleaned up at the time of JVM garbage collection
                                // intern() is used by java to put string in string pool
        String s6 = "Welocme to JAVA";
        System.out.println("1. " + s6.concat("!!!"));
        System.out.println("2. " + s6.charAt(1));
        System.out.println("3. " + s6.toCharArray());
        System.out.println("4. " + s6.length());
        System.out.println("5. " + s6.toUpperCase());
        System.out.println("6. " + s6.toLowerCase());
        System.out.println("7. " + s6.trim());
        System.out.println("8. " + s6.substring(0, 5));
        System.out.println("9. " + s6.replace('o', 'a'));
        System.out.println("10. " + s6.split(" "));
        System.out.println("11. " + s6.startsWith("We"));
        System.out.println("12. " + s6.endsWith("JAVA"));
        System.out.println("13. " + s6.contains("JAVA"));
        System.out.println("14. " + s6.indexOf('a'));
        System.out.println("15. " + s6.lastIndexOf('a'));
        System.out.println("16. " + s6.charAt(s6.length() - 1));
        System.out.println("17. " + s6.getBytes());

    }
}
