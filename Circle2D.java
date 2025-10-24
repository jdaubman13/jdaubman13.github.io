public class Circle2D {
    // Data fields
    private double x;
    private double y;
    private double radius;

    // No-arg constructor: default circle (0, 0) center and radius 1
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // Constructor with specified x, y, and radius
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // Return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Return the perimeter (circumference) of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Return true if the specified point (x, y) is inside this circle
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance <= radius;
    }

    // Return true if the specified circle is inside this circle
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance + circle.radius <= this.radius;
    }

    // Return true if the specified circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance < this.radius + circle.radius && distance > Math.abs(this.radius - circle.radius);
    }
}


import java.util.Scanner;

public class TestCircle2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User-created circle
        System.out.print("Enter x, y, and radius: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double radius = input.nextDouble();

        Circle2D userCircle = new Circle2D(x, y, radius);

        // Default circle
        Circle2D defaultCircle = new Circle2D();

        System.out.println("Area: " + userCircle.getArea());
        System.out.println("Perimeter: " + userCircle.getPerimeter());
        System.out.println("Contains point (1,1)? " + userCircle.contains(1, 1));
        System.out.println("User circle inside default circle? " + defaultCircle.contains(userCircle));
        System.out.println("Circles overlap? " + defaultCircle.overlaps(userCircle));

        input.close();
    }
}
