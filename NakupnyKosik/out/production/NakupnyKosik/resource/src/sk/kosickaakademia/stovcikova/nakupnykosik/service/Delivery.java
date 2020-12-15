package sk.kosickaakademia.stovcikova.nakupnykosik.service;

import sk.kosickaakademia.stovcikova.nakupnykosik.Item;

public class Delivery extends Item implements ServiceInterface {
    @Override
    public String toString() {
        return " - Delivery, Price: "+getItemPrice();
    }

    public Delivery(double price){
        super("delivery", price);

    }

    @Override
    public double getItemPrice() {
        return 0;
    }
}
