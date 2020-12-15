package sk.kosickaakademia.stovcikova.nakupnykosik.uncontable;

import sk.kosickaakademia.stovcikova.nakupnykosik.Item;
import sk.kosickaakademia.stovcikova.nakupnykosik.uncontable.WeightItem;

public class Peanuts extends Item implements WeightItem {
    double weight;

    public Peanuts(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public double getItemPrice() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }
}
