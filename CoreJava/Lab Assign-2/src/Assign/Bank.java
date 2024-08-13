package Assign;
import java.util.Scanner;

class Account {
    public String username;
    public int accountID;
    public double TotalAmount;

    public void displayAccount() {
        System.out.println("Account Details: " + this.username + " | " + this.accountID + " | " + this.TotalAmount + "\n");
    }

    public double getAmount() {
        return this.TotalAmount;
    }
}

class Bank1 extends Account {
    double depositAmount;
    double withdrawAmount;
    Scanner sc = new Scanner(System.in);

    void addAccount() {
        System.out.println("Enter Account details: (customer name, account ID, total amount)");
        this.username = sc.next();
        this.accountID = sc.nextInt();
        this.TotalAmount = sc.nextDouble();
        displayAccount();
    }

    void removeAccount() {
        this.username = "";
        this.accountID = 0;
        this.TotalAmount = 0.0;
        System.out.println("Account removed");
    }

    void deposit() {
        System.out.println("Current Amount: " + getAmount());
        System.out.println("Enter amount to deposit");
        this.depositAmount = sc.nextDouble();
        this.TotalAmount += this.depositAmount;
        System.out.println("New Amount: " + this.TotalAmount);
    }

    void withdraw() {
        System.out.println("Current Amount: " + getAmount());
        System.out.println("Enter amount to withdraw");
        this.withdrawAmount = sc.nextDouble();
        if (this.withdrawAmount > getAmount()) {
            System.out.println("Invalid Amount. Withdrawal amount exceeds current balance.");
        } else {
            this.TotalAmount -= this.withdrawAmount;
            System.out.println("New Amount: " + this.TotalAmount);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Bank1 b1 = new Bank1();
        b1.addAccount();
        b1.deposit();
        b1.displayAccount();
        b1.withdraw();
        b1.displayAccount();
        b1.removeAccount();
    }
}
