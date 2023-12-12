package HomeworkNr5;

public class Circle {
    public static void main(String[] args) {
        double radius = 23.5;

    }

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public  void calculateArea(double radius){
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("Площадь круга" + area);

    }

}
