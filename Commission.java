import java.util.Scanner;

class Commission {
    private double sales;

    // Constructor
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate commission
    public double commission() {
        double rate;

        if (sales >= 100000) {
            rate = 0.10;
        } else if (sales >= 50000) {
            rate = 0.05;
        } else if (sales >= 30000) {
            rate = 0.03;
        } else {
            rate = 0.02;
        }

        return sales * rate;
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commissionObj = new Commission(sales);
            double commission = commissionObj.commission();
            System.out.println("Commission is: " + commission);
        }

        scanner.close();
    }
}