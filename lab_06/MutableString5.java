import java.util.Scanner;

/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MutableString5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        System.out.println("You enter: " + s);

        System.out.println(sb);

        System.out.println(sb.reverse());

    }
}

/* Answer the following questions.
1. How many (all) objects will be created in this program?
Ans:



2. If the input string is "ABBA", what would be the output?
Ans:

*/

