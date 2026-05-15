import java.util.Scanner;

class Item {
    int code;
    double price;

    void accept(int c, double p) {
        code = c;
        price = p;
    }

    void display() {
        System.out.printf("%-10d %-10.2f\n", code, price);
    }
}

public class ItemArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];

        double total = 0;

        // Accept data for 5 items
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();

            System.out.println("Enter details for Item " + (i + 1));

            System.out.print("Enter Item Code: ");
            int code = sc.nextInt();

            System.out.print("Enter Item Price: ");
            double price = sc.nextDouble();

            items[i].accept(code, price);

            total += price;
        }
        System.out.println("\nItem Details");
        System.out.println("-------------------------");
        System.out.printf("%-10s %-10s\n", "Code", "Price");
        System.out.println("-------------------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
        }
        System.out.println("-------------------------");
        System.out.printf("Total Price = %.2f\n", total);

        sc.close();
    }
}