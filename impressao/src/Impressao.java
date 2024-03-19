import java.util.Scanner;


public class Impressao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o primeiro digito? ");
        int primeiroDigito = leitura.nextInt();

        System.out.print("Digite o segundo digito? ");
        int segundoDigito = leitura.nextInt();

        if (primeiroDigito > segundoDigito) {
            System.out.print("O maior numero é o primeiro digito " + primeiroDigito);
        } else {
            System.out.print("O maior numero é o segundo digito " + segundoDigito);
        }
    }
}