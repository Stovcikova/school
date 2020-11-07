package sk.kosickaakademia.stovcikova.scholl.pet;

public class Cat implements Animal {
    String name;

    public Cat(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}