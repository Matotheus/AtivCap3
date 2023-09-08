import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor, desconto, preco;

        System.out.println("Insira o valor do produto que receberá o desconto: ");
        valor = entrada.nextDouble();

        desconto = valor * 0.1;

        preco = valor - desconto;

        System.out.println("O novo valor é: "+ preco);

        entrada.close();
    }
}
