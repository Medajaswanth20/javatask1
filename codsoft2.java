package task3;
import java.util.*;

class Atm {
    String username;
    String password;
    float balance = 1000000f;

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new user name");
        username = sc.next();
        System.out.println("Enter new Password");
        password = sc.next();
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        int withdraw;
        System.out.println("Amount needed to be withdrawn is ");
        withdraw = sc.nextInt();
        if (balance >= withdraw) {
            System.out.println("The account balance is " + balance);
            balance -= withdraw;
            System.out.println("The balance amount is " + balance);
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("The account balance is " + balance);
        System.out.println("Amount needed to be deposited is ");
        int deposit;
        deposit = sc.nextInt();
        balance += deposit;
        System.out.println("The balance amount is " + balance);
        System.out.println("Transaction Successful");
    }
}

class Balance {
    Atm a = new Atm();

    public void balance() {
        System.out.println("The balance is " + a.balance);
    }
}

public class UserAtm {

    public static void main(String[] args) {
        System.out.println("Enter the choice\n1.register 2.exit");
        Scanner sc = new Scanner(System.in);
        Atm a = new Atm();
        Balance b = new Balance();
        int ch;
        ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Enter the choice\n1.Login 2.exit");
            int ch1;
            ch1 = sc.nextInt();
            if (ch1 == 1) {
                a.register();
                System.out.println("Enter the Login username");
                String loginuser;
                loginuser = sc.next();
                System.out.println("Enter the login password");
                String loginpassword;
                loginpassword = sc.next();
                if (a.username.equals(loginuser) && a.password.equals(loginpassword)) {
                    System.out.println("****Welcome back " + a.username + " ****");
                    while (true) {
                        System.out.println("\nEnter the choice");
                        System.out.println("1.withdraw\n2.deposit\n3.balance\n4.exit");
                        int op;
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                a.withdraw();
                                break;
                            case 2:
                                a.deposit();
                                break;
                            case 3:
                                b.balance();
                                break;
                            case 4:
                                System.out.println("Exit");
                                System.exit(0); // Exit the program
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    }
                } else {
                    System.out.println("Entered username or password is wrong");
                }
            }
        } else {
            System.out.println("End");
        }
    }
}
