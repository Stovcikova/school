package sk.kosickaakademia.stovcikova.scholl;


import sk.kosickaakademia.stovcikova.scholl.hobby.Book;
import sk.kosickaakademia.stovcikova.scholl.hobby.Hudba;
import sk.kosickaakademia.stovcikova.scholl.hobby.Sport;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {     //vytvorenie pola typu Student
        Student[] studenti;      //naplnenie pola
        studenti = Main.vytvorStudentov();

        //metoda na vypis studentov z N1 triedy
        Main.printN1Student(studenti);
        System.out.println();

        //vypis studentov kde prospech lepsi ako 2
        Main.printStudentsWhereAverageLE2(studenti);
        System.out.println();

        //vypis studentov co sa narodili nad rokom 2000
        /*Main.printStudentsWhereYearIsMoreThan2000(studenti);
        System.out.println();*/

        //vypis studentov kolko maju rokov
        Main.printAge(studenti);
        System.out.println();

        Book b1 = new Book("Hlava XXII", "J. Heller");
        studenti[0].addHobby(b1);
        Sport s1 = new Sport("Hockey");
        studenti[0].addHobby(s1);
        Hudba h1 = new Hudba( "Beethowen");
        studenti[1].addHobby(h1);
        Sport s2 = new Sport("Futbal");
        studenti[2].addHobby(s2);
        Book b2 = new Book("D.Dan", "Klbko zmiji");
        studenti[2].addHobby(b2);


        ///////////////////////////////
        /*
        //Main.printAge(studenti);
        //System.out.println(studenti[0].getDob());
        //String datum = convertDateToString(studenti[0].getDob());
        //System.out.println(datum);
        //Main.vypisPocetRokov(studenti);

         */
        //Main.zoradStudentov(studenti);
        //System.out.println();
        //Main.printStudentsWhereYearIsMoreThan2000SecondOption(studenti);
    }

    //metoda na vytvorenie studentov
    private static Student[] vytvorStudentov() {
        Student[] s = new Student[10];

        //vytvorenie 1 studenta
        Grades gradesS1 = new Grades(4, 2, 1);
        Student s1 = new Student("Adam", "Sangala", gradesS1,
                ClassName.N1, createDob("2001-11-12"));
        s[0] = s1;
        Student s2 = new Student("Helena", "Novakova", new Grades(2, 2, 1),
                ClassName.N2, createDob("2010-07-07"));
        s[1] = s2;

        Student s3 = new Student("Janko", "Hrasko", new Grades(2, 1, 4),
                ClassName.N3, createDob("1995-05-05"));
        s[2] = s3;

        Student s4 = new Student("Zuzana", "Kolvekova", new Grades(1, 1, 2),
                ClassName.N2, createDob("1999-01-10"));
        s[3] = s4;

        Student s5 = new Student("Julia", "Malikova", new Grades(3, 2, 1),
                ClassName.N1, createDob("2010-01-15"));
        s[4] = s5;

        Student s6 = new Student("Peter", "Dzuro", new Grades(3, 2, 2),
                ClassName.N2, createDob("1994-03-10"));
        s[5] = s6;

        Student s7 = new Student("Jarmila", "Slovakova", new Grades(1, 1, 1),
                ClassName.N3, createDob("1999-05-20"));
        s[6] = s7;

        Student s8 = new Student("Jakub", "Brada", new Grades(3, 1, 3),
                ClassName.N2, createDob("1999-01-10"));
        s[7] = s8;

        Student s9 = new Student("Mirka", "Secova", new Grades(4, 2, 1),
                ClassName.N2, createDob("1996-08-15"));
        s[8] = s9;

        Student s10 = new Student("David", "Oravec", new Grades(1, 1, 2),
                ClassName.N1, createDob("1992-01-20"));
        s[9] = s10;

        return s;
    }

    //metoda na vypis ak rok narodenia je vacsii ako 2000
    /*private static void printStudentsWhereYearIsMoreThan2000(Student[] studenti) {
        System.out.println("Year of born is bigger than 2000");

        for (int i = 0; i < studenti.length; i++) {
            if(studenti[i].getDob() != null){
                int year = studenti[i].getDob().getYear()+1900;
                if (year >= 2000) {
                    System.out.println(studenti[i].printStudent());
                }
            }
        }
    }*/

    //metoda na vypis ak rok narodenia je vacsii ako 2000 iny sposob
    private static void printStudentsWhereYearIsMoreThan2000SecondOption(Student[] studenti) {
        System.out.println("Year of born is bigger than 2000");

        for (int i = 0; i < studenti.length; i++) {
            if(studenti[i].getDob() != null){
                Date date = studenti[i].getDob();
                DateFormat dateFormat = new SimpleDateFormat("yyyy");
                String strDate = dateFormat.format(date);
                int year = Integer.parseInt(strDate);
                //int year = studenti[i].getDob().getYear()+1900;
                if (year >= 2000) {
                    System.out.println(studenti[i].printStudent());
                }
            }
        }
    }

    //metoda na vypis studentov ktori maju priemer lepsi ako 2
    private static void printStudentsWhereAverageLE2(Student[] students) {
        double average;
        System.out.println("Average is better than 2");
        for (int i = 0; i < students.length; i++) {
            Grades znamky = students[i].getGrades();
            average = (znamky.getEng() + znamky.getMat() + znamky.getPro()) / 3;
            if (average < 2) {
                System.out.println("Student: " + students[i].getFirstName() + " " + students[i].getLastName());
            }
        }
    }

    //metoda na vypis studentov z triedy N1
    private static void printN1Student(Student[] students) {
        int dlzka = students.length;
        System.out.println("---List 1N---");
        for (int i = 0; i < dlzka; i++) {
            if (students[i].getClassName() == ClassName.N1) {
                System.out.println(students[i].getFirstName() + " " + students[i].getLastName());
            }
        }
    }

    //metoda na vytvorenie datumu typu DATE cez String
    private static Date createDob(String dateS){
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateS);
        }catch(ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    //metoda na konvertovanie Date na String
    private static String convertDateToString(Date datum){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(datum);
        return  strDate;
    }

    //metoda na vypis studentov a ich pocet rokov
    private static void printAge(Student[] studenti){
        System.out.println("How old are you??");
        Date aktualnyDatum = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(aktualnyDatum);
        int todaysDay = c.get(Calendar.DAY_OF_MONTH);
        int todaysMonth = c.get(Calendar.MONTH)+1;
        int todaysYear = c.get(Calendar.YEAR);
        System.out.println("Actual date is: ");
        System.out.println(todaysYear +" "+ todaysMonth +" " +todaysDay);

        int rok;
        int mesiac;
        int den;
        for(int i = 0; i < studenti.length; i++){
            if(studenti[i].getDob() != null){
                String datum = convertDateToString(studenti[i].getDob());
                int datumovecislo = cisloDokopy(datum);
                //System.out.println(datumovecislo);
                rok = datumovecislo/10000;
                mesiac = (datumovecislo-rok*10000)/100;
                den = datumovecislo%100;
                //System.out.print(rok + " " + mesiac + " " + den);
                if(mesiac == todaysMonth && todaysDay < den){
                    System.out.println(studenti[i].getFirstName()+ " " + studenti[i].getLastName()
                            + " ma " + ((todaysYear-rok)-1) + " rokov");
                }else{
                    System.out.println(studenti[i].getFirstName()+ " " + studenti[i].getLastName()
                            + " ma " + (todaysYear-rok) + " rokov");
                }

            }
            //System.out.println();
        }

    }

    //pomocna metoda to string format napr 2010-05-05 -> 20100505
    private static int cisloDokopy(String datum){
        int dlzka = datum.length();
        int cislo = 0;
        for(int i = 0; i < datum.length(); i++){
            if(i == 4 || i == 7){
                continue;
            }
            cislo = cislo*10+Character.getNumericValue(datum.charAt(i));
        }
        return cislo;
    }

    //napise ktory student je na akom mieste v priemere
    private static void zoradStudentov(Student[] studenti){
        //Student[] zoradeniStudenti = new Student[studenti.length];
        double[] priemerStudentov = new double[studenti.length];
        double priemer;

        for(int i = 0; i < studenti.length; i++){
            priemer = (studenti[i].getGrades().getEng() + studenti[i].getGrades().getMat()+
                    studenti[i].getGrades().getPro())/3.0;
            priemerStudentov[i] = priemer;
        }

        //zoradit od najhorsieho po najmensi
        double k,l;
        for(int i = 0; i < studenti.length; i++){
            for(int j = studenti.length-1; j > 0; j--){
                if(priemerStudentov[j] > priemerStudentov[j-1]){
                    k = priemerStudentov[j];
                    l = priemerStudentov[j-1];
                    priemerStudentov[j] = l;
                    priemerStudentov[j-1] = k;
                }
            }
        }

        //prehodenie od najlepsich po najhorsi a iba raz ked sa opakuje dat do pola
        double[] pole = new double[studenti.length];
        int j = studenti.length-1;
        for(int i = 0; i < studenti.length; i++){
            pole[i] = priemerStudentov[j];
            j--;
        }
        j=0;
        double[] poleSkratene = new double[studenti.length];
        for(int i = 0; i < studenti.length-1; i++){
            if(pole[i] == pole[i+1]){
                continue;
            }else{
                poleSkratene[j] = pole[i];
                j++;
            }
        }


        for(int i = 0; i < studenti.length; i++){
            priemer = (studenti[i].getGrades().getEng() + studenti[i].getGrades().getMat()+
                    studenti[i].getGrades().getPro())/3.0;
            for(j = 0; j < poleSkratene.length; j++){
                if(priemer == poleSkratene[j]){
                    System.out.println(studenti[j].getFirstName() + " " + studenti[i].getLastName()
                            + " je na mieste " + (j+1));
                    break;
                }
            }
        }
    }
    //buble sort
    private static Student[]zoradStudentov2(Student[]students){
        for (int i=0; i< students.length;i++){
            for (int j=0; j<(students.length-1-i);j++){
                if (students[j].getGrades().average()>students[j+1].getGrades().average()){
                    Student pomocnaPremenna = students[j];
                    students[j] = students[j+1];
                    students[j+1]=pomocnaPremenna;
                }
            }
        }
        return students;
    }
    private static void printAllStudents(Student[]students){
        for (int i=0; i<students.length;i++){
            System.out.println(students[i].getFirstName()+" "+students[i].getLastName()+ " "+students[i].getGrades().average());
        }
    }



}
