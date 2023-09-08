import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double dinheiroReais, cotacaoDolar,cotacaoMarcoAlemao,cotacaoLibraEsterlina, dolares, marco, libra;

        System.out.print("Digite a quantidade de dinheiro em reais: ");
        dinheiroReais = entrada.nextDouble();

        cotacaoDolar = 1.80;
        cotacaoMarcoAlemao = 2.00;
        cotacaoLibraEsterlina = 3.57;

        dolares = dinheiroReais / cotacaoDolar;
        marco = dinheiroReais / cotacaoMarcoAlemao;
        libra = dinheiroReais / cotacaoLibraEsterlina;

        System.out.println("Valor em dólares: " + dolares);
        System.out.println("Valor em marco alemão: " + marco);
        System.out.println("Valor em libra esterlina: " + libra);

        entrada.close();
    }
}

