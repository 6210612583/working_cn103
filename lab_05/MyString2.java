/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MyString2 {

    public static void main(String[] args) {
        String s1, s2, s3, s4;

        s1 = "Wizard Gandalf the Grey";
        s2 = s1.toUpperCase();
        s3 = s1.toLowerCase();
        s4 = s1.substring(7);
        s4 = s1.substring(15, s1.length());

        System.out.print("s1: \"" + s1 + "\"");
        System.out.println(" : length " + s1.length());
        System.out.println();

        System.out.print("s2: \"" + s2 + "\"");
        System.out.println(" : length " + s2.length());
        System.out.println();

        System.out.print("s3: \"" + s3 + "\"");
        System.out.println(" : length " + s3.length());
        System.out.println();

        System.out.print("s4: \"" + s4 + "\"");
        System.out.println(" : length " + s4.length());
        System.out.println();
    }
}

/* Answer the following question.
1. EXCEPT for the String objects
   created in System.out.print and System.out.println
   between lines 16 - 30,
   how many String objects, both interned and normal, will be created in this program?
Ans:

*/


/* Write output of this program.





*/

