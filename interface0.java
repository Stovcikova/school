package sk.kosickaakademia.stovcikova.polymorfizmus;

public interface I0 {
    public void animal();

    default public void wildAnimal(){
        System.out.println("Horse");
    }
}