/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MyToString2 {
    public static void main(String[] args) {

        String s1 = "123";
        String s2 = "321";

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println("case 1:");
        System.out.print("s1 + s2 = ");
        System.out.println(s1 + s2);

        System.out.println("case 2:");
        System.out.print("n1 + n2 = ");
        System.out.println(n1 + n2);

        System.out.println("case 3:");
        System.out.println("s1 + s2 = " + s1 + s2);

        System.out.println("case 4:");
        System.out.println("n1 + n2 = " + n1 + n2);
    }
}

/* Answer the following question.
1. Why the outputs from "case 2:" and "case 4:" are different?
Ans:


*/
