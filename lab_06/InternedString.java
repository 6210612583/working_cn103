/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class InternedString {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " ";
        String s3 = "world";
        String s4 = "Hello" + " " + "world";
        String s5 = "Hello world";
        String s6 = s1;
        String s7 = s1 + s2;
        String s8 = s1 + s2 + s3;
        String s9 = new String("Hello");
        String s10 = new String("world");
        String s11 = new String(s9 + " " + s10);
        String s12 = new String("HELLO WORLD");
        String s13 = s12.toLowerCase();
        String s14 = s12.toUpperCase();

        System.out.println("Hello");
        System.out.println(" ");
        System.out.println("world");
        System.out.println("Hello world");
        System.out.println("Hello" + " " + "world");
        System.out.println("HELLO WORLD");
        System.out.println("hello world");
    }
}

/* Answer the following questions.
1. How many interned String objects are created in this program?
Ans:


2. How many normal String objects (not interned String) are created in this program?
Ans:


*/

