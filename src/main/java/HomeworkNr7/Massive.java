package HomeworkNr7;

public class Massive {
    public static void main(String[] args) {
        int[]numbers = new int[100];
        for (int index = 0; index < numbers.length;index++){
            numbers[index] = index + 0;
        }

        int sum = 0;
        for (int index = 0; index < numbers.length; index +=2) {
            System.out.println(numbers[index]);
            sum += numbers[index];
        }
        System.out.println("Sum "+ sum);

        System.out.println("--------------------------------------");

        int sum2 = 1;
        for(int index = 1;index < numbers.length;index +=2) {
            System.out.println(numbers[index]);
            sum2 = sum2 * numbers[index];
        }
        System.out.println("Sum of not even numbers is" + sum2);
    }
}
