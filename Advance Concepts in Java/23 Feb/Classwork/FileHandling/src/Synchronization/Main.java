package Synchronization;

class BankAccount {

    private int balance = 1000;

    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " entered withdraw()");
        System.out.println(Thread.currentThread().getName() + " acquired lock");

        while (balance < amount) {
            System.out.println("Insufficient balance...");
            System.out.println(Thread.currentThread().getName() + " waiting...");
            wait();
        }

        balance -= amount;

        System.out.println(Thread.currentThread().getName() + " completed withdrawal");
        System.out.println("Remaining balance: " + balance);
    }

    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " entered deposit()");
        System.out.println(Thread.currentThread().getName() + " acquired lock");

        balance += amount;

        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);

        notifyAll();
    }
}
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            try {
                account.withdraw(1500);
            } catch (Exception e) {}
        }, "Withdraw-1");

        Thread t2 = new Thread(() -> {
            account.deposit(1000);
        }, "Deposit-1");

        t1.start();
        t2.start();
    }
}
