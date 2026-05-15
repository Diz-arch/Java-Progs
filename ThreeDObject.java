import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double length, width, height;

    Box(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    double side;

    Cube(double a) {
        this.side = a;
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    double radius, height;

    Cone(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt((radius * radius) + (height * height));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

public class MainThreeD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj; // Single object reference to hold subclasses

        System.out.println("Enter Box dimensions (length, width, height): ");
        obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Box Surface Area: " + obj.wholeSurfaceArea() + ", Volume: " + obj.volume());

        System.out.println("\nEnter Cube side: ");
        obj = new Cube(sc.nextDouble());
        System.out.println("Cube Surface Area: " + obj.wholeSurfaceArea() + ", Volume: " + obj.volume());

        System.out.println("\nEnter Cylinder dimensions (radius, height): ");
        obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cylinder Surface Area: " + obj.wholeSurfaceArea() + ", Volume: " + obj.volume());

        System.out.println("\nEnter Cone dimensions (radius, height): ");
        obj = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cone Surface Area: " + obj.wholeSurfaceArea() + ", Volume: " + obj.volume());
        
        sc.close();
    }
}