package Assign;

class Rectangle1 {
    int height;
    int width;

    Rectangle1(int h, int w) {
        this.height = h;
        this.width = w;
    }

    void area() {
        System.out.println("Area: " + (height * width));
    }

    void perimeter() {
        System.out.println("Perimeter: " + (2 * (height + width)));
    }
}

public class Rectangle {

    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(10, 20);
        r1.area();
        r1.perimeter();
    }
}
