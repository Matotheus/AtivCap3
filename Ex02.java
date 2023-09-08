import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, num3, resultado;

        System.out.println("Insira um de três números para realizar uma multiplicação: ");
        num1 = entrada.nextDouble();
        System.out.println("Insira o segundo número: ");
        num2 = entrada.nextDouble();
        System.out.println("Insira o terceiro e último número para que a multiplicação entre os três seja realizada");
        num3 = entrada.nextDouble();

        resultado = num1*num2*num3;

        System.out.println("O resultado da multiplicação dos números é: "+ resultado);

        entrada.close();
    }
}
