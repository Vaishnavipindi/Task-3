public class Transaction {

    public static void deposit(User user, double amount) {

        if (amount > 0) {
            user.setBalance(user.getBalance() + amount);
            History.add("Deposited: " + amount);
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    public static void withdraw(User user, double amount) {

        if (amount <= user.getBalance()) {

            user.setBalance(user.getBalance() - amount);
            History.add("Withdrawn: " + amount);
            System.out.println("Please collect your cash.");

        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
