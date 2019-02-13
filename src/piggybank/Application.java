package piggybank;

public class Application {

   private static PiggyBank piggyBank = new PiggyBank();

    private static void processPiggyBank() {
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());

    }

    public static void main(String[] args) {
        processPiggyBank();
    }
}
