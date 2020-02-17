/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLO";
        String s4 = "hello";
        String s5 = s1.toUpperCase();
        String s6 = s1.toLowerCase();

        System.out.println("Using operator ==");
        System.out.println(s1 == "Hello");
        System.out.println(s1 == "HELLO");
        System.out.println(s1 == "hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println();

        System.out.println("Using method equals");
        System.out.println(s1.equals("Hello"));
        System.out.println(s1.equals("HELLO"));
        System.out.println(s1.equals("hello"));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
    }
}

/* Write output of this program.





*/


/* Answer the following questions.
1. How many interned String objects are created in this program?
Ans:


2. How many normal String objects (not interned String) are created in this program?
Ans:


*/

