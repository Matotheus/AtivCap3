import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double maior, menor, area;

        System.out.print("Diagonal maior: ");
        maior = entrada.nextDouble();
        System.out.print("Diagonal menor: ");
        menor = entrada.nextDouble();

        area = maior * menor /2;

        System.out.println("Area total do losango é: "+ area);

        entrada.close();
    }
}
