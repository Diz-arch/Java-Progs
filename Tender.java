import java.util.Scanner;

class Tender {
    String companyName;
    double cost;
    public Tender(String companyName, double cost) {
        this.companyName = companyName;
        this.cost = cost;
    }
}

public class TenderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to hold 5 Tender objects
        Tender[] tenders = new Tender[5];

        // 1. Accept data for five objects
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Tender " + (i + 1) + ":");
            
            System.out.print("Company Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Cost: ");
            double cost = scanner.nextDouble();
            
            scanner.nextLine(); 

            // Create the object and store it in the array
            tenders[i] = new Tender(name, cost);
            System.out.println();
        }

        // 2. Find the company with the minimum cost
        double minCost = tenders[0].cost;
        String minCompany = tenders[0].companyName;

        for (int i = 1; i < 5; i++) {
            if (tenders[i].cost < minCost) {
                minCost = tenders[i].cost;
                minCompany = tenders[i].companyName;
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("The company with the minimum tender cost is:");
        System.out.println("Company: " + minCompany);
        System.out.println("Cost: " + minCost);
        System.out.println("-------------------------------------------------");

        scanner.close();
    }
}