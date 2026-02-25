class Outer {

    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x = " + x);
        }
    }

    public static void main(String[] args) {
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}