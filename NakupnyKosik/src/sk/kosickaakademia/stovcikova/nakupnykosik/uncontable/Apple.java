package sk.kosickaakademia.stovcikova.nakupnykosik.uncontable;

import sk.kosickaakademia.stovcikova.nakupnykosik.Item;

public class Apple extends Item implements WeightItem {
    private double weight;

    public Apple(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }
    public double getItemPrice(){

        return weight*getPrice();
    }
    public String toString(){
        return super.toString();
    }
}
