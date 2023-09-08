import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double lado, area;

        System.out.print("Lado do quadrado: ");
        lado = entrada.nextDouble();

        area = lado * lado;

        System.out.print("A área do quadrado é: "+ area);

        entrada.close();
    }
}
