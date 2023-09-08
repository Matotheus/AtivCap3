import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, media;

        System.out.println("Insira um número para calcular a média: ");
        num1 = entrada.nextDouble();
        System.out.println("Insira o segundo número para que a média seja feita: ");
        num2 = entrada.nextDouble();

        media = (num1*2 + num2*3) /5;

        System.out.println("A média desses dois números é: "+ media);

        entrada.close();
    }
}
