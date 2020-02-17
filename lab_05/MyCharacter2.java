/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MyCharacter2 {

    static void printInfo(char ch) {

        System.out.println("Character: " + ch);

        // method getName requires an int parameter
        // ch (a char) is auto converted to an int
        String s = Character.getName(ch);
        System.out.println("\t" + s);

        if (Character.isDigit(ch)) {
            int val = Character.digit(ch, 10);

            System.out.println("\tvalue => " + val);
        } else {
            System.out.println("\tvalue => NOT a digit.");
        }
    }

    public static void main(String[] args) {
        char ch;

        ch = '1';
        printInfo(ch);
        System.out.println();

        ch = 'A';
        printInfo(ch);
        System.out.println();

        ch = '๑';
        printInfo(ch);
        System.out.println();

        ch = 'ก';
        printInfo(ch);
        System.out.println();
    }

}

/* Write output of this program.





*/

