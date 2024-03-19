import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int primeiroValor = leitura.nextInt();

        System.out.println("Digite o segundo valor");
        int segundoValor = leitura.nextInt();

        System.out.println("Digite o terceiro valor");
        int terceiroValor = leitura.nextInt();

        if (primeiroValor > segundoValor && primeiroValor > terceiroValor) {
            System.out.println("O primeiro valor foi o maior digitado");
        } else if (segundoValor > primeiroValor && segundoValor > terceiroValor) {
            System.out.println("O segundo valor foi o maior digitado");
        } else {
            System.out.println("O terceiro valor foi o maior digitado");
        }
    }
}