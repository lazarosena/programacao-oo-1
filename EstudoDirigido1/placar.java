import java.util.ArrayList;

public class Placar
{
    private ArrayList<Jogador> ranking; 

    //construtor
    public Placar()
    {
        this.ranking = new ArrayList<>();
    }

    //adiciona no ranking
    public void adicionaJogadorRanking(jogador j)
    {
        this.ranking.add(j);
    }

    public void mostraRankingTela()
    {
        System.out.println("\n===== RANKING DE JOGADORES =====");
        for (jogador j : ranking)
        {
            System.out.println("Jogador: " + j.getNome() + "| Pontuaçao: " + j.getPontuacao());
        }
        System.out.println("================================");
    }


    public void exibirPlacarFinal(Jogador Jogador)
    System.out.println("======PLACAR FINAL======");
    System.out.println("Jogador: " + jogador.getNome());
    System.out.println("Tentativas: " + jogador.getTentativas());
    System.out.println("Pontuação: " + jogador.getPontuacao());
    System.out.println("========================");

}