import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTrabalhadas, horasExtras;
        double salarioMinimo, valorHoraTrabalhada, valorHoraExtra, salarioBruto, quantiaHorasExtras, salarioReceber;

        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = entrada.nextInt();
        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = entrada.nextDouble();
        System.out.print("Digite o número de horas extras trabalhadas: ");
        horasExtras = entrada.nextInt();

        valorHoraTrabalhada = salarioMinimo / 8;
        valorHoraExtra = salarioMinimo / 4;

        salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        quantiaHorasExtras = horasExtras * valorHoraExtra;
        salarioReceber = salarioBruto + quantiaHorasExtras;

        System.out.println("O salário a receber é: " + salarioReceber);

        entrada.close();
    }
}


