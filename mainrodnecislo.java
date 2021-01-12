package sk.kosickaakademia.stovcikova.rodnecislo;

import java.lang.ref.PhantomReference;


public class Main {
        public static void main(String[] args) {
            PersonalID p = new PersonalID();
            System.out.println(p.checkID("995110/8893"));
        }
    }