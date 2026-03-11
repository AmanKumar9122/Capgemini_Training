// Problem Statement:
// - Multiple threads can credit and debit money simultaneously.
// - Balance should never go negative.
// - Reads should be fast, but writes must be thread-safe.
// - You are NOT allowed to use database locks.

// Tasks:
// - Design a Wallet class.
// - Ensure thread safety for concurrent debit/credit operations.
// - Prevent race conditions and inconsistent balance.
// - Explain which Java concurrency mechanisms you would use and why.
public class Wallet {
    private int balance;
    public Wallet(int initialBalance) {
        this.balance = initialBalance;
    }
    // synchronized methods to ensure thread safety for credit and debit operations
    public synchronized void credit(int amount) {
        balance += amount;

    }
    public synchronized boolean debit(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    public int getBalance() {
        return balance;
    }
    public static void main(String[] args) throws InterruptedException{
        Wallet wallet = new Wallet(1000);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                wallet.credit(100);
                System.out.println("Credited 100, balance: " + wallet.getBalance());
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (wallet.debit(150)) {
                    System.out.println("Debited 150, balance: " + wallet.getBalance());
                } else {
                    System.out.println("Failed to debit 150, balance: " + wallet.getBalance());
                }
            }
        });
        
        t1.start();
        t1.join();
        
        t2.start();
        t2.join();
        System.out.println(wallet.getBalance());
    }
}

// How would your solution change if 1000+ read operations and very few writes happen per second without using database locks?
// Without using read write locks, we can use the volatile keyword to ensure visibility of changes to the balance variable across threads. 
// This allows multiple threads to read the balance without blocking each other, while still ensuring that any updates to the balance are visible to all threads. 
// However, we would need to ensure that the credit and debit methods are still synchronized to prevent race conditions during updates to the balance.
