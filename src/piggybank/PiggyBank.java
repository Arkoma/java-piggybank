package piggybank;

import java.util.HashMap;

public class PiggyBank {

    private int total = 0;
    private HashMap<String, Integer> bank = new HashMap<String, Integer>();

    public PiggyBank() {
        this.total = total;
        this.bank = bank;
    }

    public void add(Coin coin) {
        if (this.bank.get(coin) == null) {
            this.bank.put(String.valueOf(coin.getName()), coin.getNumOfCoins());
        }
        this.bank.forEach((coin1, integer) -> {
            if (coin.getName() == coin1) {
                integer += coin.getNumOfCoins();
            }
        });
    }

    public void add(Bill bill) {
        if (this.bank.get(bill) == null) {
            this.bank.put(String.valueOf(bill.getName()), bill.getNumOfBills());
        }
        this.bank.forEach((coin1, integer) -> {
            if (bill.getName() == coin1) {
                integer += bill.getNumOfBills();
            }
        });
    }
}

