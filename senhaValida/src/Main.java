import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe a senha: ");
        int senha = leitura.nextInt();

        if (senha == 1234) {
            System.out.print("ACESSO\tPERMITIDO...");
        } else {
            System.out.print("ACESSO\tNEGADO\t");
        }
    }
}