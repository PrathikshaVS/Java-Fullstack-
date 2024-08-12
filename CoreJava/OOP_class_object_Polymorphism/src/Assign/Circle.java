package Assign;

class Circle1 {
    int radius;

    Circle1(int r) {
        this.radius = r;
    }

    void area() {
        System.out.println("Area: " + (3.14 * this.radius * this.radius));
    }

    void circumstance() {
        System.out.println("Circumference: " + (2 * 3.14 * this.radius));
    }
}

public class Circle {

    public static void main(String[] args) {
        Circle1 c1 = new Circle1(10);
        c1.area();
        c1.circumstance();
    }
}
