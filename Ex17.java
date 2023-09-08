import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raio, comprimento, area, volume;

        System.out.print("Digite o valor do raio da esfera: ");
        raio = entrada.nextDouble();

        comprimento = 2 * Math.PI * raio;

        area = Math.PI * raio * raio;

        volume = 4.0 / 3.0 * Math.PI * Math.pow(raio, 3);

        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Área da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);

        entrada.close();
    }
}

