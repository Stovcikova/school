package sk.kosickaakademia.stovcikova.scholl;

public class Faktorial {
    public static void main(String[] args) {
        int result= fakt(6);
        System.out.println("Faktorial: "+result);
    }

    private static int fakt(int v) {   //rekurzivna metoda vola seba samu
        if (v==1)                   //kedze pokracuje do zapornych cisel, treba osetrit
            return 1;
        else
            return v*fakt(v-1);
    }
}