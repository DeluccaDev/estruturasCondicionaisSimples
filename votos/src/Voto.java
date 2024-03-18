import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = leitura.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = leitura.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade <= 16) {
            System.out.println("Você possui " + idade + " Não pode votar ainda");
        } else if (idade >= 16 && idade <= 70 ) {
            System.out.println("Você possui " + idade + " e opcional o seu voto");
        } else {
            System.out.println("Você possui " + idade + " e Obrigatorio votar");
        }
        System.out.println(idade);
    }
}