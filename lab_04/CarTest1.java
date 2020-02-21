package car;

import java.util.Scanner;

/**
 * CarTest1 class
 *
 * @author 6210612583 <6210612583@cn103>
 * @version 0.0.1
 */
public class CarTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        int speed;
        String color;  // reference to a String object
        Scanner sc;    // reference to a Scanner object
        Car myCar;     // reference to a Car object

        sc = new Scanner(System.in);  // create a new Scanner object
        myCar = new Car();            // create a new Car object

        // Before change
        System.out.println("My car has color: " + myCar.getColor());
        System.out.println("My car has speed: " + myCar.getSpeed());

        // Change
        System.out.print("Enter color: ");
        color = sc.next();
        myCar.setColor(color);
        System.out.print("Enter speed: ");
        speed = sc.nextInt();
        myCar.setSpeed(speed);

        // After change
        System.out.println("My car has color: " + myCar.getColor());
        System.out.println("My car has speed: " + myCar.getSpeed());
    }
}