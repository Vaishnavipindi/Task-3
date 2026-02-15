public class Transfer {

    public static void send(User user, double amount) {

        if (amount <= user.getBalance()) {

            user.setBalance(user.getBalance() - amount);
            History.add("Transferred: " + amount);
            System.out.println("Amount Transferred Successfully!");

        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
