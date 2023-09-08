import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroLados, numeroDiagonais;

        System.out.print("Digite o número de lados do polígono: ");
        numeroLados = entrada.nextInt();

        numeroDiagonais = numeroLados * (numeroLados - 3) / 2;

        System.out.println("O número de diagonais do polígono é: " + numeroDiagonais);

        entrada.close();
    }
}
