import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, resultado;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextDouble();

        resultado = numero1 - numero2;

        System.out.print("Resultado: " + resultado);

        entrada.close();
    }
}
