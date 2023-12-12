package HomeworkNr5;

public class TemperatureConverter {
    public static void main(String[] args) {
        double Celsius = 25;
        double Fahrenheit = 63;

        toCelsius(Fahrenheit);
        toFahrenheit(Celsius);
    }

    public static void toCelsius(double Fahrengheit){
        double Celsius = (Fahrengheit - 32) * 5 / 9;
        System.out.println(Fahrengheit + " градусов Фаренгейта равны " + Celsius + " градусам Цельсия.");

    }

    public static void toFahrenheit(double Celsius){
        double Fahrenheit = (Celsius *9 / 5) + 32;
        System.out.println(Celsius + "градусы Цельсия равны"+ Fahrenheit + "градусам фаренгейта");
    }

}
