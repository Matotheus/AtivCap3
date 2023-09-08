import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double maior, menor, altura, area;

        System.out.print("Informe a base maior do trapézio: ");
        maior = entrada.nextDouble();
        System.out.print("Informe sua base menor: ");
        menor = entrada.nextDouble();
        System.out.print("Informe sua altura: ");
        altura = entrada.nextDouble();

        area = ((maior + menor) * altura) /2;

        System.out.print("A área total desse trapézio é: "+ area);

        entrada.close();
    }
}