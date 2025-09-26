package Lista1;
public class Lampada {
    // Atributos
    private boolean ligada;
    private String cor;

    // Construtor
    public Lampada(String corInicial) {
        this.ligada = false; // começa desligada
        this.cor = corInicial;
    }

    // Métodos
    public void ligar() {
        ligada = true;
        System.out.println("A lâmpada foi ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("A lâmpada foi desligada.");
    }

    public void trocarCor(String novaCor) {
        if (ligada) {
            cor = novaCor;
            System.out.println("Cor da lâmpada trocada para: " + novaCor);
        } else {
            System.out.println("Não é possível trocar a cor com a lâmpada desligada!");
        }
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada na cor " + cor + ".");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

        public static void main(String[] args) {
            Lampada lamp = new Lampada("Branco");

            lamp.mostrarEstado();   // desligada
            lamp.trocarCor("Amarelo"); // não pode trocar porque está desligada
            lamp.ligar();           // ligar
            lamp.trocarCor("Amarelo"); // agora troca
            lamp.mostrarEstado();   // ligada, cor amarelo
            lamp.desligar();        // desligar
            lamp.mostrarEstado();   // desligada
        }
}