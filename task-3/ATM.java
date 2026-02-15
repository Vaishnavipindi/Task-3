import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User("Vee123", "2004", 5000);

        System.out.println("===== WELCOME TO ATM =====");

        System.out.print("Enter User ID: ");
        String id = sc.next();

        System.out.print("Enter PIN: ");
        String pin = sc.next();

        if (user.login(id, pin)) {

            System.out.println("\nLogin Successful!\n");

            int choice;

            do {
                System.out.println("1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        History.showHistory();
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double w = sc.nextDouble();
                        Transaction.withdraw(user, w);
                        break;

                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double d = sc.nextDouble();
                        Transaction.deposit(user, d);
                        break;

                    case 4:
                        System.out.print("Enter amount to transfer: ");
                        double t = sc.nextDouble();
                        Transfer.send(user, t);
                        break;

                    case 5:
                        System.out.println("Thank you for using ATM!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

                System.out.println();

            } while (choice != 5);

        } else {
            System.out.println("Invalid Login Details!");
        }

        sc.close();
    }
}
