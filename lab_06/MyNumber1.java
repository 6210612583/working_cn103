/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MyNumber1 {
    public static void main(String[] args) {

        String s1 = "123";
        String s2 = "321";

        String s3 = "11";
        String s4 = "11";

        String s5 = "2.5e2";
        String s6 = "3.5E-2";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);

        double d1 = Double.parseDouble(s5);
        double d2 = Double.parseDouble(s6);

        int result = Integer.compare(i1,i2);

        if (result == 0) {
            System.out.println(i1 + " == " + i2);
        }
        else if (result < 0) {
            System.out.println(i1 + " < " + i2);
        }
        else {
            System.out.println(i1 + " > " + i2);
        }

        result = Float.compare(f1,f2);

        if (result == 0) {
            System.out.println(f1 + " == " + f2);
        }
        else if (result < 0) {
            System.out.println(f1 + " < " + f2);
        }
        else {
            System.out.println(f1 + " > " + f2);
        }

        result = Double.compare(d1,d2);

        if (result == 0) {
            System.out.println(d1 + " == " + d2);
        }
        else if (result < 0) {
            System.out.println(d1 + " < " + d2);
        }
        else {
            System.out.println(d1 + " > " + d2);
        }

    }

}


/* Answer the following questions.
1. Will there be any difference in output if line 11 and 12 are chagned to
    String s3 = "11f";
    String s4 = "11F";
Ans:


2. Will there be any difference in output if line 11 and 12 are chagned to
    String s3 = "11d";
    String s4 = "11D";
Ans:

3. Will there be any difference in output if line 11 and 12 are chagned to
    String s3 = "11x";
    String s4 = "11X";
Ans:


*/

