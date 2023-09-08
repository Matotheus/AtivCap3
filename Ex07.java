import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso, aumento, perca;

        System.out.println("Insira o peso: ");
        peso = entrada.nextDouble();

        aumento = peso * 1.15;
        perca = peso - (peso*0.20);

        System.out.println("Se engordar 15%: "+ aumento);
        System.out.println("Se emagrecer 20%: "+ perca);

        entrada.close();
    }
}
