abstract class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account");
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account");
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Current Account");
        } else {
            System.out.println("Insufficient balance in Current Account");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("SA123", 5000);
        Account acc2 = new CurrentAccount("CA456", 10000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayBalance();

        acc2.deposit(5000);
        acc2.withdraw(12000);
        acc2.displayBalance();
    }
}