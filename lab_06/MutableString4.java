/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MutableString4 {
    public static void main(String[] args) {
        StringBuilder sb;
        String s1 = "true";
        String s2 = "false";
        String s3 = " == ";
        String s4 = " != ";

        sb = new StringBuilder("1");

        sb.append("+");
        sb.append("2");
        sb.append(s3);
        sb.append("3");
        sb.insert(sb.length(), " is ");
        int curLen = sb.length();
        sb.append(s1);
        System.out.println(sb);

        sb.replace(curLen, sb.length(), s2);
        System.out.println(sb);

        sb.replace(3, 7, s4);
        System.out.println(sb);

        sb.delete(3, sb.length());         // delete till end of string
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}

/* Answer the following questions.
1. How many (all) objects will be created in this program?
Ans:



2. What is the final capacity of StringBuilder (sb) before the program ends?
Ans:


3. What is the final string length of StringBuilder (sb) before the program ends?
Ans:

*/

