class Factorial {

    int number = 5;

    int calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int result = obj.calculateFactorial(obj.number);
        System.out.println("Factorial = " + result);
    }
}