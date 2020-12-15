package sk.kosickaakademia.stovcikova.parsexml;

public class Ovocie {
    int cislo;
    String nazov;
    int jednotkovaCena;
    double vaha;

    public Ovocie(int cislo) {
        this.cislo = cislo;
        this.jednotkovaCena = jednotkovaCena;
    }

    public Ovocie(String nazov) {
        this.nazov = nazov;
    }

    public Ovocie(double vaha) {
        this.vaha = vaha;
    }

    public Ovocie(int cislo, String nazov, int jednotkovaCena, double vaha) {

    }
    public String toString(){
        return " "+ cislo + "."+ nazov+" - "+ vaha+ "[kg] po" + jednotkovaCena + " [eue] = "+vaha*jednotkovaCena+ " [eur]";
    }

}
