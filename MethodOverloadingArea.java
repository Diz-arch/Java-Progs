class Area {

    // Area of square
    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square = " + result);
    }

    // Area of rectangle
    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }

    // Area of circle
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

public class MethodOverloadingArea {

    public static void main(String[] args) {

        Area a = new Area();

        a.area(5);          // Square
        a.area(4, 6);       // Rectangle
        a.area(3.5);        // Circle
    }
}