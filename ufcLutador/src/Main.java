//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0]= new Lutador("Petty boy", "França", 31 , 1.75f , 68.9f , 11 , 2 , 1);
        l[1]= new Lutador("PuttyScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 2);
        l[2]= new Lutador("Snapshadowo", "EUA", 35, 1.65f, 80.9f, 12, 0, 2);
        l[3]= new Lutador("Dead Code", "Autralia", 35, 1.93f, 82.6f, 13, 0, 2 );
        l[4]= new Lutador("UfoCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5]= new Lutador("Nerdaart","EUA", 37, 1.81f, 105.9f, 12, 2, 4);

        Luta UEC = new Luta();
        UEC.marcarLuta(l[4], l[5]);
        UEC.lutar();
        l[0].status();
        l[1].status();

    }
}