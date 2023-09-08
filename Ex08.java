import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso, gramas;

        System.out.println("Insira o peso(em kg): ");
        peso = entrada.nextDouble();

        gramas = peso * 1000;

        System.out.println("O peso em gramas é: "+ gramas);

        entrada.close();
    }
}
