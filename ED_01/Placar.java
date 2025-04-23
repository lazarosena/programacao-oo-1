import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A classe {@code Placar} gerencia o ranking de jogadores em um jogo.
 * Permite adicionar jogadores, exibir o ranking na tela e salvar os dados em um arquivo.
 */
public class Placar
{
    /**
     * Lista que armazena os jogadores participantes para o ranking.
     */
    private ArrayList<Jogador> ranking; 

    /**
     * Construtor da classe Placar.
     * Inicializa a lista de jogadores no ranking.
     */
    public Placar()
    {
        this.ranking = new ArrayList<>();
    }

     /**
     * Adiciona um jogador ao ranking.
     * 
     * @param j O jogador a ser adicionado.
     */
    public void adicionaJogadorRanking(Jogador j)
    {
        this.ranking.add(j);
    }

     /**
     * Exibe o ranking de jogadores ordenado por pontuação (decrescente) na tela.
     */
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

      /**
     * Exibe o placar final de um jogador após o fim do jogo.
     *
     * @param jogador O jogador cujo desempenho será exibido.
     */
    public void exibirPlacarFinal(Jogador jogador)
    {
    System.out.println("======PLACAR FINAL======");
    System.out.println("Jogador: " + jogador.getNome());
    System.out.println("Tentativas: " + jogador.getTentativas());
    System.out.println("Pontuação: " + jogador.getPontuacao());
    System.out.println("========================");
    }

     /**
     * Salva o ranking dos jogadores em um arquivo texto.
     *
     * @param nomeArquivo O nome do arquivo onde o ranking será salvo.
     */
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