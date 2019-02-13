package piggybank;

public class Application {

   private static PiggyBank piggyBank = new PiggyBank();

    private static void processPiggyBank() {
        piggyBank.add(new Quarter());
    }

    public static void main(String[] args) {
        processPiggyBank();
    }
}
