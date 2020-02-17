/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MyString3 {

    public static void main(String[] args) {
        String fileName = "yyyy_mm_dd_MyString3.java";

        int dot = fileName.lastIndexOf('.');
        int underScore = fileName.lastIndexOf('_');

        String name = fileName.substring(0, dot);
        String extension = fileName.substring(dot+1);
        String date = fileName.substring(0, underScore);

        underScore = date.indexOf('_');

        String year = date.substring(0, underScore);

        String month = date.substring(underScore+1, underScore+3);

        underScore = date.lastIndexOf('_');
        String day = date.substring(underScore+1);

        System.out.println("Name     : " + name);
        System.out.println("Extension: " + extension);
        System.out.println("Date     : " + date);
        System.out.println("Year     : " + year);
        System.out.println("Day      : " + day);
        System.out.println("Month    : " + month);
    }
}

/* Answer the following questions.
1. How many interned String objects are created in this program?
Ans:


2. How many normal String objects (not interned String) are created in this program?
Ans:
*/


/* Write output of this program.





*/

