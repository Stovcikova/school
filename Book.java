package sk.kosickaakademia.stovcikova.scholl.hobby;

public class Book  extends Hobby{
    private String autor;

    public Book(String name, String autor){
        super(name);
        this.autor=autor;

    }
    public String getAutor(){
        return autor;
    }
}