class MethodOverloading {

    // Method with one parameter
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two integers: " + sum);
    }

    // Method with three parameters
    void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three integers: " + sum);
    }

    // Method with double parameters
    void add(double a, double b) {
        double sum = a + b;
        System.out.println("Sum of two double numbers: " + sum);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(5.5, 3.2);
    }
}