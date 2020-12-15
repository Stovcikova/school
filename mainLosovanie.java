package sk.kosickaakademia.stovcikova.homework.arraylisst;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Losovanie losovanie = new Losovanie();
        System.out.println("Vitajte v programe losovanie ");
        String volba = "0";

        while (!(volba.equals("3"))) {   //hlavny cyklus
            System.out.println("1 - losovat dalsie cislo");
            System.out.println("2- vypisat cislo ");
            System.out.println("3- koniec ");
            volba = sc.nextLine();
            System.out.println();
            switch (volba) {
                case "1":
                    System.out.println("Vyzrebovalo cislo: %s/n" + losovanie.losuj());
                    break;

                case "2":
                    System.out.println("Vyzrebovalo cislo: %s/n" + losovanie.losuj());
                    break;
                case "3":
                    System.out.println("Dakujem z losovanie");
                    break;
                default:
                    System.out.println("Neplatna volba, prosim zadajte znova");
                    break;
            }
        }
    }
}