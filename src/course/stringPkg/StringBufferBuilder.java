package course.stringPkg;

public class StringBufferBuilder {
    // string is IMMUTABLE when created using string literals and new string
    // string is MUTABLE when created using stringbuffer and stringbuilder

    // StringBuffer is thread safe means only one thread can process a method at a
    // time > thus slow

    // StringBuilder is not thread safe means multiple threads can process a method
    // at a time > fast

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("stringBuffer");
        StringBuilder sbb = new StringBuilder("stringBulder");
        sb.append("!!");
        sbb.append("!!");
        System.out.println(sb);
        System.out.println(sbb);
        System.out.println(sb.charAt(1));
        sb.delete(2, 6);
        System.out.println(sb);
        sb.toString(); // it will convert this stringBuffer to a string
    }
}
