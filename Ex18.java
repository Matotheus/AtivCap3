import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double temperaturaCelsius, temperaturaFahrenheit;

        System.out.print("Digite a temperatura em Celsius: ");
        temperaturaCelsius = entrada.nextDouble();

        temperaturaFahrenheit = 180 * (temperaturaCelsius + 32) / 100;

        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

        entrada.close();
    }
}