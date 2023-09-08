import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double catetoA, catetoB, hipotenusa;

        System.out.print("Digite o valor do cateto A: ");
        catetoA = entrada.nextDouble();
        System.out.print("Digite o valor do cateto B: ");
        catetoB = entrada.nextDouble();

        hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);

        System.out.println("O valor da hipotenusa é: " + hipotenusa);

        entrada.close();
    }
}

