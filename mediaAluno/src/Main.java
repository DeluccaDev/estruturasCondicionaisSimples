import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lerEntrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        float n1 = lerEntrada.nextFloat();
        System.out.print("Digite a primeira nota do aluno: ");
        float n2 = lerEntrada.nextFloat();
        float media = (n1 + n2) / 2;

        if (media <= 6) {
            System.out.println("Aluno abaixo da media, REPROVADO");
        } else if (media <= 8) {
            System.out.println("Aluno abaixo da media, EM RECUPERAÇÃO");
        } else {
            System.out.println("aluno dentro da media, APROVADO");
        }

    }
}