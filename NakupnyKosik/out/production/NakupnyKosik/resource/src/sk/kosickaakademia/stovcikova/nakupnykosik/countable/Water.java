package sk.kosickaakademia.stovcikova.nakupnykosik.countable;

import sk.kosickaakademia.stovcikova.nakupnykosik.Item;
import sk.kosickaakademia.stovcikova.nakupnykosik.countable.CountItem;

public class Water extends Item implements CountItem {
    private int count;

    public Water(String name, double price, int count) {
        super(name, price);
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public double getItemPrice(){
        return getPrice()*count;
    }
}

