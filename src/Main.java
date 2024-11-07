package ie.atu.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Create a Temperature object with 25 degrees Celsius
        Temperature temp = new Temperature(25);

        // Get and display temperature in Celsius and Fahrenheit
        System.out.println("Temperature in Celsius: " + temp.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp.getFahrenheit());

        // Change the temperature using Celsius
        temp.setCelsius(30);
        System.out.println("Updated Temperature in Celsius: " + temp.getCelsius());
        System.out.println("Updated Temperature in Fahrenheit: " + temp.getFahrenheit());

        // Change the temperature using Fahrenheit
        temp.setFahrenheit(100);
        System.out.println("Updated Temperature in Celsius (from Fahrenheit): " + temp.getCelsius());
        System.out.println("Updated Temperature in Fahrenheit (from Fahrenheit): " + temp.getFahrenheit());
    }
}
