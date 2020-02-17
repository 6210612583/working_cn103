/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MyCharacter1 {

    public static void main(String[] args) {
        char c1, c2, t1, t2;
        Character cCh1, cCh2, tCh1, tCh2;

        c1 = '1';       // assign a character
        c2 = '\u0032';  // use unicode escape codepoint

        cCh1 = new Character('1');  // create Character object
        cCh2 = new Character('2');  // create Character object

        System.out.println("t1 = " + c1);
        System.out.println("t2 = " + c2);

        System.out.println("tCh1 = " + cCh1);
        System.out.println("tCh2 = " + cCh2);

        t1 = '๑';       // assign a character
        t2 = '\u0E52';  // use unicode escape codepoint

        tCh1 = new Character('๑');      // create Character object
        tCh2 = new Character('\u0E52'); // create Character object

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);

        System.out.println("tCh1 = " + tCh1);
        System.out.println("tCh2 = " + tCh2);
    }
}

/* Write output of this program.





*/

