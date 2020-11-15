package sk.kosickaakademia.stovcikova.polymorfizmus;


public class Main {
    public static void main(String[] args) {
        B p1= new B();   //yavol8n konstruktor A potom B
        p1.print();    // yavola sa metoda print y triedy b

        A p2= new C();    //yavola sa konstruktor A, potom B, potom C
        p2.print();    //yavola sa print z triedy C
        ((B)p2).print();   //vypise print y triedy C
        p2.wildAnimal();
        ((C)p2).programmingLanguage();   //metodu moyem volat, len po pretzpovani na B alebo C

        A p3=new A();
        p3.wildAnimal();

        I1 p4=new B();   //vypise kontrruktor A,B
        p4.wildAnimal();

       C p5= new C();
       p5.print();
       A p6= new A("mobilny telefon");



            }
        }