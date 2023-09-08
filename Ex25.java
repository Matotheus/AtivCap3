import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int hora, minutos, minutosConvertidos, totalMinutos, totalSegundos;

        System.out.print("Digite a hora: ");
        hora = entrada.nextInt();
        System.out.print("Digite os minutos: ");
        minutos = entrada.nextInt();

        minutosConvertidos = hora * 60;
        totalMinutos = minutos + minutosConvertidos;
        totalSegundos = totalMinutos * 60;


        System.out.println("A hora digitada convertida em minutos é: " + minutosConvertidos + " minutos");
        System.out.println("O total dos minutos é: " + totalMinutos + " minutos");
        System.out.println("O total dos minutos convertidos em segundos é: " + totalSegundos + " segundos");

        entrada.close();
    }
}

