import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nascimento, ano, idade, meses, dias, semanas;

        System.out.print("Insira seu ano de nascimento: ");
        nascimento = entrada.nextInt();
        System.out.print("Em que ano estamos: ");
        ano = entrada.nextInt();

        idade = ano - nascimento;
        meses = idade * 12;
        dias = idade * 365;
        semanas = idade * 52;
        
        System.out.println("Você tem "+ idade + " anos");
        System.out.println("Você tem "+ meses + " meses");
        System.out.println("Você tem "+ dias + " dias");
        System.out.println("Você tem "+ semanas + " semanas");

        entrada.close();
    }
}