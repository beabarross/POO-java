package Lista1;
public class Robo {

    public String nome;
    public int energia;

    public Robo(String nome){
        this.nome = nome;
        this.energia = 0;
    }

    public void executarTarefa(String tarefa){
        if (energia >= 10) {
            energia -= 10;
            System.out.println("Tarefa " + tarefa + " concluída!");
        } else {
            System.out.println(" Energia baixa! Recarregar para executar tarefa! ");
        }
    }

    public void recarregar() {
        if (energia >= 100) {
            System.out.println("A energia está cheia em 100");
        } else {
            energia += 10;
            System.out.println("A energia foi recarregada!");
        }
    }

    public void status() {
        System.out.println("O nível atual de energia é: "+ energia);
    }

    public static void main(String[] args) {
        Robo rob = new Robo ("Alexa");

        rob.status(); //Energia começa em 0
        rob.recarregar(); //recarrega em 10 a energia
        rob.recarregar(); // a energia fica em 20
        rob.executarTarefa("limpar"); //robo executa a tarefa limpar e perde 10 de energia
        rob.status(); //a energia fica em 10

    }
}