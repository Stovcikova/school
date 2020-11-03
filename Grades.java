package sk.kosickaakademia.stovcikova.scholl;

public class Grades {   //extends object
    private int mat;
    private int eng;
    private int pro;

    public Grades(int mat, int eng, int pro) {    //parametricky konstruktor
        this.mat = mat;
        this.eng = eng;
        this.pro = pro;

    }

    public int getMat() {
        return mat;
    }

    public int getEng() {
        return eng;

    }

    public int getPro() {
        return pro;
    }

    //metoda vrati retazec znamok
    @Override
    public String toString() {
        return "Grades: MAT " + mat + " ENG" + eng + "PRO" + pro;

    }
    public double average(){
        return (double)((mat+pro+eng)/3);
    }
}
