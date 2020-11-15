package sk.kosickaakademia.stovcikova.polymorfizmus;

public class C extends B{

    public C() {
        System.out.println("I am constructor C () ");
    }

    @Override  //Anotacia prekryla metodu print
    public void print() {
        System.out.println("Class C: print ()");
    }
}