package sk.kosickaakademia.stovcikova.scholl;

import sk.kosickaakademia.stovcikova.scholl.hobby.*;

import java.util.Date;

public class Student {
    //vlastnosti //properties
    private String firstName;
    private String lastName;
    private ClassName className;    //N1 N2 N3
    private int salary;
    private Date dob;
    private Grades grades;    //Grades trieda - data typ, grades....variable premenná
    private Hobby[] hobbies;
    private int countHobbies;

    //metódy
    public Student (String firstName, String lastName, Grades grades, ClassName className){
        this.firstName=firstName;
        this.lastName=lastName;
        this.grades=grades;
        this.className=className;
        hobbies = new Hobby[5];
        countHobbies = 0;
    }
    public Student(String firstName, String lastName, Grades grades, ClassName className, Date dob){
        this(firstName, lastName,grades,className);     //zavolam dalsi konstruktor
        this.dob=dob;
        hobbies = new Hobby[5];
        countHobbies = 0;
    }
    //gettery a settery
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setDob(Date dob){
        this.dob=dob;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public ClassName getClassName(){
        return className;
    }
    public int getSalary(){
        return salary;
    }
    public Date getDob(){ return dob; }
    public Grades getGrades() {
        return grades;
    }
    public String printStudent() {
        return getFirstName() + " " + getLastName();
    }
    public void addHobby(Hobby newHobby){ //tato metoda nevrati nic, ale prijme konicky
        int dlzka = hobbies.length;
        if (countHobbies==5){
            System.out.println("Error: nie je mozne pridat dalsie hobby");
            return;
        }
        /*hobbies[dlzka] = newHobby;*/

    }
    public void printHobbies(){
        System.out.println(firstName+" "+lastName);
        if (countHobbies>0){
        for (int i=0; i< countHobbies; i++){
            if (hobbies[i] instanceof Book){
                System.out.println("Názov knihy: "+hobbies[i].getName()+""+((Book) hobbies[i]).getAutor());
            }else if (hobbies[i] instanceof Movie){
                System.out.println("Názov movie:"+ hobbies[i].getName()+" "+((Movie) hobbies[i]).getYear());
            }else if (hobbies[i] instanceof Sport) {
                System.out.println("Nazov sport:" + hobbies[i].getName());
            }else if (hobbies[i] instanceof Hudba){
                System.out.println("Nazov hudba:"+ hobbies[i].getName());
            }else if (hobbies[i] instanceof Pecenie){
                System.out.println("Nazov pečenie: "+ hobbies[i].getName());
            }
        }

        }else {
            System.out.println("Student nema ziadne hobby");
        }
    }
}