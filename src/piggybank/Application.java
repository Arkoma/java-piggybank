package piggybank;

public class Application {

   private static PiggyBank piggyBank = new PiggyBank();

    private static void processPiggyBank() {
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));
        piggyBank.bank.forEach(($, n) -> {
            if ($.getName() == "$") {
                System.out.println($.getName() + " " + n);
            } else {
                System.out.println(n + " " + $.getName());
            }
        });

        System.out.println("The piggy bank holds $" + piggyBank.total);
    }

    public static void main(String[] args) {
        processPiggyBank();
    }
}
