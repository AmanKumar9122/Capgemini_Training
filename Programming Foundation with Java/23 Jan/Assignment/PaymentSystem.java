import java.util.*;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card " + cardNumber);
    }
}

class UPIPayment implements Payment {
    String upiId;

    UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI " + upiId);
    }
}

class WalletPayment implements Payment {
    String wallet;

    WalletPayment(String wallet) {
        this.wallet = wallet;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using wallet " + wallet);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("1234-5678");
        Payment p2 = new UPIPayment("user@upi");
        Payment p3 = new WalletPayment("PayWallet");

        p1.pay(500);
        p2.pay(250);
        p3.pay(300);
    }
}