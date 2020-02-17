/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class MyToString1 {

    public static void main(String[] args) {
        String s1 = "String s1";
        StringBuffer s2 = new StringBuffer("StringBuffer s2");
        StringBuilder s3 = new StringBuilder("StringBuilder s3");

        Integer i = new Integer(10);
        Double d = new Double(20);

        System.out.println("String object: " + s1);
        System.out.println("String object: " + s1.toString());

        System.out.println("StringBuffer object: " + s2);
        System.out.println("StringBuffer object: " + s2.toString());

        System.out.println("StringBuilder object: " + s3);
        System.out.println("StringBuilder object: " + s3.toString());

        System.out.println("Integer object: " + i);
        System.out.println("Integer object: " + i.toString());

        System.out.println("Double object: " + d);
        System.out.println("Double object: " + d.toString());

        MyToString1 ms1 = new MyToString1();
        MyToString1 ms2 = new MyToString1();
        MyToString1 ms3 = new MyToString1();

        System.out.println("MyToString1 object: " + ms1);
        System.out.println("MyToString1 object: " + ms1.toString());

        System.out.println("MyToString1 object: " + ms2);
        System.out.println("MyToString1 object: " + ms2.toString());

        System.out.println("MyToString1 object: " + ms3);
        System.out.println("MyToString1 object: " + ms3.toString());
    }
}

/* Answer the following question.
1. Is there any differrence between calling and not calling method toString for object ms1, ms2 and ms3?
Ans:


*/

