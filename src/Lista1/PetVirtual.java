package Lista1;
public class PetVirtual {

    public String nome;
    public int fome;
    public int felicidade;

    public PetVirtual(String nome, int fome, int felicidade) {
        this.nome = nome;
        this.fome = fome;
        this.felicidade = felicidade;
    }

    public void alimentar() {
        fome -= 20;
        if (fome < 0) fome = 0;
    }

    public void brincar() {
        felicidade += 15;
        if (felicidade > 100) felicidade = 100;
        fome += 10; //brincar dá fome;
        if (fome > 100) fome = 100;
    }

    public void status() {
        if (fome > 80) {
            felicidade -= 10;
            if (felicidade < 0) felicidade = 0;
            System.out.println(nome + " está com muita fome! A felicidade diminuiu.");
        }

        System.out.println(" Nome: " +nome + "| Fome: " + fome + "| Felicidade: "+ felicidade);
    }

    public static void main(String[] args) {
        PetVirtual pet = new PetVirtual("Tommie", 80, 90);

        pet.status();
        pet.brincar();
        pet.alimentar();
        pet.status();

        pet.fome = 90;
        pet.status();
    }
}
