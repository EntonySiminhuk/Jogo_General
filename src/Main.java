import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("|________________________|");
            System.out.println("|*..:: Jogo General ::..*|");
            System.out.println("|________________________|");
            System.out.println("|1 - Incluir jogadores   |");
            System.out.println("|2 - Remover Jogador     |");
            System.out.println("|3 - Mostrar Cartela     |");
            System.out.println("|4 - Finalizar Jogo      |");
            System.out.println("|________________________|");
            System.out.print("Entre com uma opcao: ");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("Informe o numero de jogadores: ");
                    int num = input.nextInt();
                    Campeonato j = new Campeonato(num);
                    j.IncluirJogador();
                    System.out.println("Jogador: "+j.toString());
                    break;
                case 2:
                    j.RemoverJogador();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("\nFinalizando Jogo General\n");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente");
                }
            }
            while(opcao != 3);
    }

}
