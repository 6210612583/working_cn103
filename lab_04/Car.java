package car;

/**
 * Simple class to model a car.
 *
 * @author 6210612583 <6210612583@cn103>
 * @version 0.0.1
 */
public class Car {

    private String color;
    private float speed;

    /**
     * Gets the value of color
     *
     * @return the value of color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of color
     *
     * @param color new value of color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the value of speed
     *
     * @return the value of speed
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of speed
     *
     * @param speed new value of speed
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }
}