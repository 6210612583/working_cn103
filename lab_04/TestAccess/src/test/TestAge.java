package test;

import bird.Eagle;
import bird.Parrot;
import bug.Beetle;
import bug.Spider;

/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */
public class TestAge {

    public static void main(String[] args) {
        Eagle e1;
        Parrot p1;
        Beetle b1;
        Spider s1;

        e1 = new Eagle(240);
        p1 = new Parrot(360);
        b1 = new Beetle(1);
        s1 = new Spider(3);

        System.out.println("Eagle  age: " + e1.getAge());
        System.out.println("Parrot age: " + p1.getAge());
        System.out.println("Beetle age: " + b1.getAge());
        System.out.println("Spider age: " + s1.getAge());
    }
}

/*
Explain:

1. Can method main in TestAge use object e1 to access method getAge()? If not, why ?
Ans:


2. Can method main in TestAge use object p1 to access method getAge()? If not, why ?
Ans:


3. Can method main in TestAge use object b1 to access method getAge()? If not, why ?
Ans:


4. Can method main in TestAge use object s1 to access method getAge()? If not, why ?
Ans:


*/

