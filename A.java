package sk.kosickaakademia.stovcikova.polymorfizmus;

public class A implements  I1 {
    private int number;

    public void print() {
        System.out.println(" Class A: print ()");
    }

    public A() {
        System.out.println("I am constructor A () ");
        number = 40;
    }

    public A(String text) {
        this();  //zavolal konstruktor A
        System.out.println(" I am constructor A () and I got a  text:" + text);
    }

    public A(String text, String name) {
        this();  //zavolal konstruktor A
        System.out.println(" I am constructor A (), you call:" + name + "and I got a  text:" + text);
    }

    @Override
    public void animal() {
        System.out.println("Owl");
    }

    @Override
    public void wildAnimal() {
        System.out.println("Cow");

    }
}