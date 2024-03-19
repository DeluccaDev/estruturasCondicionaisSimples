import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Quantas maças estão sendo compradas?");
        int macaComprada = leitura.nextInt();

        if (macaComprada <= 12) {
            int valormenor = (int) (macaComprada * 0.30);
            System.out.println("O valor de cada maça será de 0.30, com total de " + valormenor + "R$");
        } else {
            int valorMaior = (int) (macaComprada * 0.25);
            System.out.println("O valor de cada maça será de 0.25, com total de " + valorMaior + "R$");
        }
    }
}