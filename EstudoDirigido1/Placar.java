import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;


public class Placar
{
    private ArrayList<Jogador> ranking; 

    //construtor
    public Placar()
    {
        this.ranking = new ArrayList<>();
    }

    //adiciona no ranking
    public void adicionaJogadorRanking(Jogador j)
    {
        this.ranking.add(j);
    }

    public void mostraRankingTela()
    {
        Collections.sort(ranking, (j1, j2) -> Integer.compare(j2.getPontuacao(), j1.getPontuacao()));

        System.out.println("\n===== RANKING DE JOGADORES =====");
        for (Jogador j : ranking)
        {
            System.out.println("Jogador: " + j.getNome() + "| Pontuaçao: " + j.getPontuacao());
        }
        System.out.println("================================");
    }

    
    public void exibirPlacarFinal(Jogador jogador)
    {
    System.out.println("======PLACAR FINAL======");
    System.out.println("Jogador: " + jogador.getNome());
    System.out.println("Tentativas: " + jogador.getTentativas());
    System.out.println("Pontuação: " + jogador.getPontuacao());
    System.out.println("========================");
    }

    public void salvarRankingEmArquivo(String nomeArquivo)
    {
        try (FileWriter fileWriter = new FileWriter(nomeArquivo, true);
            PrintWriter printWriter = new PrintWriter(fileWriter))           
        {

        Collections.sort(ranking, (j1, j2) -> Integer.compare(j2.getPontuacao(), j1.getPontuacao()));

        for (Jogador j : ranking)
        {
            printWriter.write("Jogador: " + j.getNome() + " | Pontuaçao: " + j.getPontuacao() + "\n");
        }

            System.out.println("Ranking salvo em: " + nomeArquivo);
        } catch (IOException e) 
        {
            System.out.println("Erro ao salvar ranking: " + e.getMessage());
        }
    }
}
