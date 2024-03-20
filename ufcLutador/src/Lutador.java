public class Lutador {

    private String nome;
    private String nacionalidadde;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public void apresentar() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Chegou a hora apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidadde());
        System.out.println("Com idade de " + this.getIdade());
        System.out.println("Com idade de " + this.getIdade());
        System.out.println("Pesando " + this.getPeso());
        System.out.println(this.getVitorias() + " Vitorias ");
        System.out.println(this.getDerrotas() + " Derrotas ");
        System.out.println(this.getEmpates() + " Empate ");
    }
    public void status() {
        System.out.println(this.getNome() + "É um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " Vezes ");
        System.out.println("Perdeu " + this.getDerrotas() + " Vezes ");
        System.out.println("Empatou " + this.getEmpates() + " Vezes ");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);

    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);

    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String nome, String nacionalidadde, int idade, float altura, float peso, int vitorias, int derrotas, int impates) {
        this.nome = nome;
        this.nacionalidadde = nacionalidadde;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = impates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidadde() {
        return nacionalidadde;
    }

    public void setNacionalidadde(String nacionalidadde) {
        this.nacionalidadde = nacionalidadde;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3 ) {
            this.categoria = "Leve";
        } else if (this.peso <=83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int impates) {
        this.empates = impates;
    }
}
