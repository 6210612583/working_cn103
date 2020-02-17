import java.util.Scanner;

/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MyInteger {

    /**
     * Returns a string representation of the integer argument as an unsigned integer in base 2
     *
     * @param  i an integer to be converted to a string
     * @return the string representation of the unsigned integer value represented by the argument in binary (base 2)
     */
    public static String toBinaryString(int i) {

        // DO NOT use method Integer.toBinaryString

        return null;
    }

    /**
     * Returns a string representation of the integer argument as an unsigned integer in base 8
     *
     * @param  i an integer to be converted to a string
     * @return the string representation of the unsigned integer value represented by the argument in octal (base 8)
     */
    public static String toOctalString(int i) {

        // DO NOT use method Integer.toOctalString

        return null;
    }

    /**
     * Returns a string representation of the integer argument as an unsigned integer in base 16
     *
     * @param  i an integer to be converted to a string
     * @return the string representation of the unsigned integer value represented by the argument in hexadecimal (base 16)
     */
    public static String toHexString(int i) {

        // DO NOT use method Integer.toHexString

        return null;
    }

    /**
     * Returns an integer corresponding to the string argument in binary representation
     * @param  s string of binary representation
     * @return the corresponding integer
     */
    public static int fromBinaryString(String s) {
        return 0;
    }

    /**
     * Returns an integer corresponding to the string argument in octal representation
     * @param  s string of octal representation (with possible leading 0)
     * @return the corresponding integer
     */
    public static int fromOctalString(String s) {
        return 0;
    }

    /**
     * Returns an integer corresponding to the string argument in hexadecimal representation
     * @param  s string of hexadecimal representation (with possible leading 0x, 0X or #)
     * @return the corresponding integer
     */
    public static int fromHexString(String s) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int n;

        System.out.print("Enter an integer: ");
        n = sc.nextInt();

        System.out.println("Bin: " + toBinaryString(n));
        System.out.println("Oct: " + toOctalString(n));
        System.out.println("Hex: " + toHexString(n));
        System.out.println();


        System.out.print("Enter BIN string: ");
        s = sc.next();
        System.out.println("int: " + fromBinaryString(s));
        System.out.println();


        System.out.print("Enter OCT string: ");
        s = sc.next();
        System.out.println("int: " + fromOctalString(s));
        System.out.println();


        System.out.print("Enter HEX string: ");
        s = sc.next();
        System.out.println("int: " + fromHexString(s));
    }
}

