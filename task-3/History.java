import java.util.ArrayList;

public class History {

    private static ArrayList<String> history = new ArrayList<>();

    public static void add(String record) {
        history.add(record);
    }

    public static void showHistory() {

        System.out.println("----- Transaction History -----");

        if (history.isEmpty()) {
            System.out.println("No Transactions Yet.");
        } else {
            for (String h : history) {
                System.out.println(h);
            }
        }
    }
}
