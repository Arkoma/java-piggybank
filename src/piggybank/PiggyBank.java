package piggybank;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PiggyBank {

    public double total = 0;
    public HashMap<Money, Integer> bank = new LinkedHashMap<Money, Integer>();

    public PiggyBank() {
        this.total = total;
        this.bank = bank;
    }

    public void add(Money $) {
            this.bank.put($, $.numOfMonies);
            total += $.getTotal();
    }
}

