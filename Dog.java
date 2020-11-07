package sk.kosickaakademia.stovcikova.scholl.pet;

import sk.kosickaakademia.stovcikova.scholl.hobby.Hobby;

public class Dog implements Animal{
    String name;

    public Dog() {

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }



}