package Homework_nr_8;

public class Main {
    public static void main(String[] args) {
        Employee c1 = new Employee("Max", 19,"Worker");
        Employee b1 = new Employee("Oleg",18,"Student");
        Employee a1 = new Employee("Ksenia",24,"Wie");
        Date f1 = new Date(12,2,2023);

        f1.displayDate();


       Invoice Iphone = new Invoice("Iphone 15 Pro Max",
               "The Iphone is very good phne",
               -1,
               12345);


       Iphone.getAmount();
    }
}
