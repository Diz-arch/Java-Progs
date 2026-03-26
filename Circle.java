class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class Circle {
    private Point center;  
    private double radius;

    Circle(int x, int y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.print("Center of Circle: ");
        center.display();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2, 3, 5.5);
        c1.display();
    }
}