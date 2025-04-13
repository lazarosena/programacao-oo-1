import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Placar placar = new Placar();

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        Jogador jogador = new Jogador(nome);
        Jogo jogo = new Jogo(jogador);

        boolean acertou = false;
        while (!acertou)
        {
            System.out.print("Tente adivinhar o numero (1 a 100): ");
            int tentativa = scanner.nextInt();

            String resultado = jogo.jogar(tentativa);
            System.out.println(resultado);

            if (resultado.equals("Acertou!"))
            {
                acertou = true;
            }
        }

        placar.exibirPlacarFinal(jogador);

        placar.adicionaJogadorRanking(jogador);
        placar.mostraRankingTela();

        scanner.close();

    }
}
