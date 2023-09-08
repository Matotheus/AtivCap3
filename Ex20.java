import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double angulo, distancia, medidaEscada;

        System.out.print("Digite a medida do ângulo em graus: ");
        angulo = entrada.nextDouble();
        System.out.print("Digite a distância da escada à parede: ");
        distancia = entrada.nextDouble();

        medidaEscada = distancia / Math.cos(Math.toRadians(angulo));

        System.out.println("A medida da escada é: " + medidaEscada);

        entrada.close();
    }
}

