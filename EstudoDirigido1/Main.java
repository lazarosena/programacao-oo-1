import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Placar placar = new Placar();
        boolean continuar = true;

    while (continuar)
    {
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        Jogador jogador = new Jogador(nome);
        Jogo jogo = new Jogo(jogador);

        boolean acertou = false;
        while (!acertou)
        {
            System.out.print("Tente adivinhar o numero (1 a 100): ");
            int tentativa = scanner.nextInt();
            scanner.nextLine();

            String resultado = jogo.jogar(tentativa);
            System.out.println(resultado);

            if (resultado.equals("Acertou!"))
            {
                acertou = true;
            }
        }

        placar.exibirPlacarFinal(jogador);
        placar.adicionaJogadorRanking(jogador);

        System.out.println("\nO que voce quer fazer agora?");
        System.out.println("1 - Jogar novamente");
        System.out.println("2 - Ver ranking");
        System.out.println("3 - Sair");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha)
        {
        case 1:
            placar.salvarRankingEmArquivo("ranking.txt");
            break;
        case 2:
            placar.salvarRankingEmArquivo("ranking.txt");
            placar.mostraRankingTela();
            break;
        case 3:
            placar.mostraRankingTela();
            placar.salvarRankingEmArquivo("ranking.txt");
            continuar = false;
            System.out.println("Obrigado por jogar!");
            break;
        default:
            System.out.println("Opçao invalida, voltando para o menu.");
        }

    }
        //scanner.close() 
    }
}
