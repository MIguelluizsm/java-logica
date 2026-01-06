import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Conversor de Temperatura ===");
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();
      
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("\nResultado:");
        System.out.println("Celsius: " + celsius + " °C");
        System.out.println("Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Kelvin: " + kelvin + " K");

        input.close();
    }
}
