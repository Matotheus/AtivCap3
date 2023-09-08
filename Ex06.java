import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, vendas, comissao, salarioFinal;

        System.out.println("Insira o salário fixo: ");
        salario = entrada.nextDouble();
        System.out.println("Insira o valor das vendas: ");
        vendas = entrada.nextDouble();

        comissao = vendas * 4/100;

        salarioFinal = salario + comissao;

        System.out.println("Comissão: "+ comissao);
        System.out.println("Salário final: "+ salarioFinal);

        entrada.close();
    }
}
