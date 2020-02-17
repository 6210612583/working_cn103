/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MyCharacter3 {

    static void printCount(String name, int start, int end) {
        int countDigit;
        int countLetter;
        int countDefine;
        int codePoint;
        char ch;
        String str;

        countDigit = 0;
        countLetter = 0;
        countDefine = 0;
        codePoint = start;
        while (codePoint <= end) {

            if (Character.isDigit(codePoint)) {
                countDigit++;
            }

            if (Character.isLetter(codePoint)) {
                countLetter++;
            }

            if (Character.isDefined(codePoint)) {
                countDefine++;
            }
            codePoint++;
        }

        System.out.println(name + ":");
        System.out.println("\t" + countDigit + " digits");
        System.out.println("\t" + countLetter + " letters");
        System.out.println("\t" + countDefine + " defined code points");

        System.out.println();

    }

    public static void main(String[] args) {
        // See http://en.wikipedia.org/wiki/List_of_Unicode_characters
        final int UNICODE_BLOCK_LATIN_1_START = 0x0000; // U+0000
        final int UNICODE_BLOCK_LATIN_1_END = 0x007F;   // U+007F

        final int UNICODE_BLOCK_THAI_START = 0x0E00;    // U+0E00
        final int UNICODE_BLOCK_THAI_END = 0x0E7F;      // U+0E7F

        printCount("Basic Latin 1",
                UNICODE_BLOCK_LATIN_1_START,
                UNICODE_BLOCK_LATIN_1_END);

        printCount("Thai",
                UNICODE_BLOCK_THAI_START,
                UNICODE_BLOCK_THAI_END);
    }
}

/* Write output of this program.





*/

