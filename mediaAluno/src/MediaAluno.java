import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        float nota1 = leitura.nextFloat();

        System.out.println("Digite a segunda nota do aluno");
        float nota2 = leitura.nextFloat();;

        float media = (nota1 + nota2) / 2;

        if (media <= 6) {
            System.out.println("Aluno Reprovado!!!");
        } else if (media > 6 && media <= 8) {
            System.out.println("Aluno em RECUPERAÇÃO");
        } else
            System.out.println("Aluno APROVADO");
    }
}
