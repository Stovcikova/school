package sk.kosickaakademia.stovcikova.nakupnykosik.countable;

import sk.kosickaakademia.stovcikova.nakupnykosik.Item;
import sk.kosickaakademia.stovcikova.nakupnykosik.countable.CountItem;

public class Choco extends Item implements CountItem {
    private int count;

    public Choco(String name, double price, int count) {
        super(name, price);
        this.count = count;
    }

    @Override
    public double getItemPrice() {
        return 0;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
