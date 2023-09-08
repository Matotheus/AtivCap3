import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um número para que seja calculada sua tabuada: ");
        int num = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " × " + i + " = " + resultado);
        }

        entrada.close();
    }
}