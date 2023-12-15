package HomeworkNr7;

public class Massive {
    public static void main(String[] args) {
        int[]numbers = new int[100];
        for (int index = 0; index < numbers.length;index++){
            numbers[index] = index + 1;
        }

        int sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
            sum += numbers[index];
        }

        System.out.println("Sum "+ sum);
    }
}
