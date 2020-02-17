/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class StringArray {
    public static void main(String[] args) {
        final int SIZE = 4;
        String s[];
        boolean res;

        s = new String[SIZE];

        for (int i = 0; i < s.length; i++) {
            s[i] = Integer.toString(i, 2);
        }

        System.out.println("s size: " + s.length);
        for (int i = 0; i < s.length; i++) {
            System.out.printf("s[%d] = %4s: ", i, s[i]);
            System.out.println("len => " + s[i].length());
        }

        res = s[0] + s[1] == s[1] + s[0];
    }

}

/* Write output of this program.




*/

/* Answer the following questions.
1. How many array objects are created in this program?
Ans:


2. How many normal String objects (not interned String) are created in this program?
Ans:

3. What is the value of variable res before the program ends?
Ans:


*/

