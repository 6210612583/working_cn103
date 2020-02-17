/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MutableString2 {
    public static void main(String[] args) {
        String s;
        StringBuilder sb;

        sb = new StringBuilder();  // create a StringBuilder object

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        s = "A lot of people";
        sb.append(s);

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        s = " are afraid of heights.";
        sb.append(s);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        s = " Not me, I'm afraid of";
        sb.append(s);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        s = " widths.";
        sb.append(s);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        sb.setLength(5);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}

/* Answer the following questions.
1. How many (all) objects will be created in this program?
Ans:



2. What is the final capacity of StringBuilder sb before the program ends?
Ans:


*/

