package Lista1;
public class DiarioSecreto {

    private String dono;
    private String senha;
    private String texto;

    public DiarioSecreto(String dono, String senha) {
        this.dono = dono;
        this.senha = senha;
        this.texto = "";
    }

    public void escrever(String senha, String novoTexto) {
        if (senha.equals(this.senha)) {
            texto = novoTexto;
            System.out.println("Texto registrado com sucesso!");
        } else {
            System.out.println("Acesso negado.");
        }
    }

    public void ler(String senha) {
        if (senha.equals(this.senha)) {
            System.out.println("Conteúdo do diário: " + texto);
        } else {
            System.out.println("Acesso negado.");
        }
    }

    public static void main(String[] args) {
        DiarioSecreto meuDiario = new DiarioSecreto("Bea", "1234");

        meuDiario.escrever("1234", "Hoje foi um dia incrível!");

        meuDiario.escrever("0000", "Não vai funcionar.");

        meuDiario.ler("1234");

        meuDiario.ler("0000");
    }
}
