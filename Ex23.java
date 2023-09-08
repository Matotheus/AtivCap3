import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double angulo1, angulo2, angulo3;

        System.out.print("Digite a medida do primeiro ângulo: ");
        angulo1 = entrada.nextDouble();
        System.out.print("Digite a medida do segundo ângulo: ");
        angulo2 = entrada.nextDouble();

        angulo3 = 180 - angulo1 - angulo2;

        System.out.println("A medida do terceiro ângulo é: " + angulo3 + " graus");

        entrada.close();
    }
}
