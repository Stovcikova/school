package sk.kosickaakademia.stovcikova.polymorfizmus;

public class B extends A implements I2{

    public B() {
        System.out.println("I am constructor B () ");

    }

    @Override
    public void print() {
        System.out.println("Class B: print ()");
    }

    @Override
    public void wildAnimal() {
        System.out.println(" Dog");

    }

    public void programmingLanguage(){
        System.out.println("Class B love Java");
    }
}