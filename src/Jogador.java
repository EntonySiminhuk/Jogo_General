import java.util.Random;
import java.io.Serializable;

public class Jogador implements Serializable{
    private String nome;
    private String tipoJogador;
    private JogoGeneral jogoG = new JogoGeneral();

    public void iniciaJogador(String n, String tJ){//inicia a classe jogador
        this.nome = n;
        this.tipoJogador = tJ;
    }

    public void jogarDados(){
        jogoG.rolarDados();
    }

    public String toString(){
        return "valores obtidos: "+jogoG;
    }

    public void escolherJogada(int jogadaEscolhida){//escolherJogada para o jogador humano
        int total;
        total = jogoG.validarJogada(jogadaEscolhida);
        jogoG.pontuarJogada(jogadaEscolhida, total);
    }

    public void escolherJogada(){//escolherJogada para o jogador maquina
        int total = 0;
        Random random = new Random();
        int jEscMaq;
        jEscMaq = random.nextInt(13) + 1;
        while(total == 0){
            total = jogoG.validarJogada(jEscMaq);
            jEscMaq = random.nextInt(13) + 1;
        }
        jogoG.pontuarJogada(jEscMaq, total);
    }

    public void mostraJogadasExecutadas(int i){
        int[] jogadasExecutadas = jogoG.getJogadas();
        if(i < 6){
            System.out.print("" + jogadasExecutadas[i]+ "  ");
        }
        else{
            System.out.print("" + jogadasExecutadas[i]+ "     ");
        }
    }

    public void mostraJogadasCartela(int i){
        int[] jogadasExecutadas = jogoG.getJogadas();
            System.out.print("      " + jogadasExecutadas[i] + "      ");
    }

    public String getNome(){
        return nome;
    }
    public String getTipoJ(){
        return tipoJogador;
    }
}
