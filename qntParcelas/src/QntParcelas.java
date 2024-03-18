import java.util.Scanner;

public class QntParcelas {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor da divida? ");
        int valorDivida = leitura.nextInt();
        System.out.println("Deseja pagar em quantas parcelas? ");
        int qntParcelas = leitura.nextInt();
        float parcelamento = (float)(valorDivida / qntParcelas);
        if (valorDivida >= 1000) {
            System.out.println("Você pode dividir em ate 12 x sem juros");
        } else if (valorDivida == 999 && valorDivida >= 500) {
            System.out.println("Você pode dividir em ate 6 x sem juros");
        } else {
            System.out.println("Voce pode parcelar em ate 3 x sem juros");
        }

    }
}