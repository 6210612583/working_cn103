import java.util.Scanner;

/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class CommonPrefix {

    /**
     *
     * @param s1 first string
     * @param s2 second string
     * @return longest common prefix of the 2 strings, null if no common prefix
     */
    public static String prefix(String s1, String s2) {
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;

        System.out.print("Enter 1st string: ");
        s1 = sc.nextLine();

        System.out.print("Enter 2nd string: ");
        s2 = sc.nextLine();

        System.out.println("Common prefix: " + prefix(s1,s2));
    }
}

