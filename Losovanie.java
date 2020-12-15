package sk.kosickaakademia.stovcikova.homework.arraylisst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Losovanie {


        private ArrayList<Integer> cisla;
        private Random random;

        public void Losovac () {
            random = new Random(); // nahodny generator
            cisla = new ArrayList<Integer>();
        }
        public int losuj () {   //metoda prida do arralistu nahodne cislo
            Integer cislo = random.nextInt(100) + 1;
            cisla.add(cislo);
            return cislo;
        }
        public String vypis () {
            String s = "";
            Collections.sort(cisla);
            for (int i : cisla) {
                s += i + " ";
            }
            return s;
        }
    }