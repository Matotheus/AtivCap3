import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, resultado;
        
        System.out.println("Insira um número para que a divisão seja realizada: ");
        num1 = entrada.nextDouble();
        System.out.println("Insira o segundo número: ");
        num2 = entrada.nextDouble();

        resultado = num1/num2;

        System.out.println("O resultado da divisão é: "+ resultado);

        entrada.close();
    }
}
