/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MyNumber2 {
    public static void main(String[] args) {

        Integer a = new Integer(20);
        Integer b = new Integer("20");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));

        int c = new Integer(22);       // should not write this
        int d = new Integer("23");     // should not write this

        Integer e = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }

}

/* Answer the following questions.
1. Why the output from line 11 is different from line 12 or 13.
Ans:


2. Why can variable c and d (of primitive int types) on line 15 and 16 be assigned with Integer objects?
Ans:


*/

