class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNo, double bal, double interestRate) {
        super(accNo, bal);
        this.interestRate = interestRate;
    }

    void addInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest added.");
    }
}

class FixedDepositAccount extends SavingsAccount {
    int maturityPeriod; // in months

    FixedDepositAccount(String accNo, double bal, double interestRate, int maturityPeriod) {
        super(accNo, bal, interestRate);
        this.maturityPeriod = maturityPeriod;
    }

    void calculateMaturityAmount() {
        double maturityAmount = balance * Math.pow((1 + interestRate / 100), maturityPeriod / 12.0);
        System.out.println("Maturity Amount: " + maturityAmount);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        FixedDepositAccount acc = new FixedDepositAccount("ACC123", 50000, 5, 24);

        acc.displayBalance();
        acc.deposit(10000);
        acc.addInterest();
        acc.calculateMaturityAmount();
        acc.displayBalance();
    }
}