package Lista1;
public class PersonagemDeJogo {
    public String nome;
    public String tipo;
    public int vida;
    public int forca;


    public PersonagemDeJogo(String nome, String tipo, int vida, int forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar() {
        System.out.println(nome + "," + tipo + " ataca com força de " + forca + "!");
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome + " | Tipo: " + tipo + " | Vida: " + vida);
    }

    public static void main(String[] args) {
    PersonagemDeJogo p1 = new PersonagemDeJogo("Scorpion", "Ninja", 80, 25);
    PersonagemDeJogo p2 = new PersonagemDeJogo("Kitana", "Assassina", 100, 20);

    System.out.println("\n--- Luta ---");
    p1.atacar();
    p2.receberDano(p1.forca);

    p2.atacar();
    p1.receberDano(p2.forca);

// Status final
        System.out.println("\n--- Status após luta ---");
        p1.exibirStatus();
        p2.exibirStatus();
    }


}