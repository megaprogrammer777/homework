package class_working;

public class classwork {
    public static void main(String[] args) {

        double sum = 0.0;
        for (int i = 1, j = 3; i <= 97 && j <= 99; i += 2, j += 2){
        sum += (double) i / j;}
        System.out.println("Сумма серий" + sum);
    }
}