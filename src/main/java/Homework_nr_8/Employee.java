package Homework_nr_8;

public class Employee {
    private String name;
    private int age;
    private String otdel;

    public Employee(String name, int age, String otdel) {
        this.name = name;
        this.age = age;
        this.otdel = otdel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOtdel() {
        return otdel;
    }

    public void setOtdel(String otdel) {
        this.otdel = otdel;
    }

    public void DoingSomething(){
        System.out.println("He is doing something");
    }
}


