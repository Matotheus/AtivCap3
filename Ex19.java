import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double largura, comprimento, area, potenciaIluminacao;

        System.out.print("Digite a largura do cômodo em metros: ");
        largura = entrada.nextDouble();
        System.out.print("Digite o comprimento do cômodo em metros: ");
        comprimento = entrada.nextDouble();

        area = largura * comprimento;

        potenciaIluminacao = area * 18;

        System.out.println("Área do cômodo: " + area + " m²");
        System.out.println("Potência de iluminação necessária: " + potenciaIluminacao + " W");

        entrada.close();
    }
}

