
/*
 * CSD-402 Java for Programmers
 * Module 6.2 Programming Assignment
 * Program: Fan.java
 * Description: Creates a Fan class with different speeds,
 * colors, sizes, and on/off settings.
 */

public class Fan {

    // Constants for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and setter for on/off
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Returns the fan's current information
    @Override
    public String toString() {
        return "Fan Speed: " + speed +
               "\nFan On: " + on +
               "\nFan Radius: " + radius +
               "\nFan Color: " + color;
    }

    // Main method to test the Fan class
    public static void main(String[] args) {

        // Fan using default constructor
        Fan fan1 = new Fan();

        // Fan using constructor with arguments
        Fan fan2 = new Fan(FAST, true, 10, "blue");

        System.out.println("Default Fan:");
        System.out.println(fan1);

        System.out.println("\nCustom Fan:");
        System.out.println(fan2);

        // Test setter methods
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("red");

        // Test getter methods
        System.out.println("\nUpdated Default Fan:");
        System.out.println("Speed: " + fan1.getSpeed());
        System.out.println("On: " + fan1.isOn());
        System.out.println("Radius: " + fan1.getRadius());
        System.out.println("Color: " + fan1.getColor());
    }
}
