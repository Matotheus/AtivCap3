import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, minimo, calculo;

        System.out.print("Insira o salário: ");
        salario = entrada.nextDouble();

        minimo = 1.320;
        calculo = salario / minimo;

        System.out.print("Você recebe o equivalente a "+ calculo + " salários mínimos.");

        entrada.close();
    }
}
