//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Video v [] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 10 de PHP");
        v[2] = new Video("Aula 12 de HTML 5");

        Garfanhoto g [] = new Garfanhoto[2];
        g[0] = new Garfanhoto("Lucas", 25, "M", "juba");
        g[1] = new Garfanhoto("Pedro", 19, "M", "Exemplo");
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}