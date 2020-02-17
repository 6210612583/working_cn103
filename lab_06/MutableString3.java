/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MutableString3 {
    public static void main(String[] args) {
        String s = "Hello";
        String w = " world";
        StringBuilder sb = new StringBuilder(s);
        StringBuffer sbuf = new StringBuffer(s);

        System.out.println(s);
        System.out.println(sb);
        System.out.println(sbuf);

        s = s + w;
        sb = sb.append(w);
        sbuf = sbuf.append(w);

        System.out.println(s);
        System.out.println(sb);
        System.out.println(sbuf);
    }

}

/* Answer the following questions.
1. How many (all) objects will be created in this program?
Ans:



2. After the statement on line 16:
        s = s + w;
Is there a new object created?
Ans:


3. After the statement on line 17:
        sb = sb.append(w);
Is there a new object created?
Ans:


4. After the statement on line 18:
        sbuf = sbuf.append(w);
Is there a new object created?
Ans:


*/

