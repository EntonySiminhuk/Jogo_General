import java.util.Scanner;

public class Campeonato {
    private Jogador[] jogadors;
    private int resultado;
    private int numeroJogadores;

    public Campeonato (int totJogador){
        this.jogadors = new Jogador[totJogador];
        this.resultado = 0;
        this.numeroJogadores = 0;
    }

    Scanner input = new Scanner(System.in);

    public void IncluirJogador(){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o nome do Jogador: ");
        String n = input.nextLine();
        System.out.print("Entre com o tipo de jogador(M para maquina ou P para pessoa): ");
        String t = input.nextLine();
        this.jogadors[numeroJogadores] = new Jogador(n,t);
        numeroJogadores++;
    }

    public void RemoverJogador()
    {
        for (int i =0; n <= numeroJogadores;i++)
            System.out.println(" "+ jogadors);
    }

    public String toString() {
        return jogadors + " " + resultado + " " + numeroJogadores;
    }
}
