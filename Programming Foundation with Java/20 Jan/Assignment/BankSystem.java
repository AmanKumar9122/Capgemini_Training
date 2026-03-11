import java.util.*;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount() {
        accountNumber = 0;
        holderName = "Unknown";
        balance = 0;
    }

    BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        balance = 0;
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient");
        }
    }

    void display() {
        System.out.println(accountNumber + " " + holderName + " " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount a1 = new BankAccount(1001, "Aman", 5000);
        BankAccount a2 = new BankAccount(1002, "Ravi", 8000);

        a1.display();
        a2.display();

        a1.deposit(2000);
        a1.display();

        a2.withdraw(3000);
        a2.display();
    }
}