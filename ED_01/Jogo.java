import java.util.Random;
/**
 * A classe Jogo representa um jogo de adivinhação de números.
 * Ela permite que um jogador tente adivinhar um número secreto.
 */
public class Jogo
{
    private Jogador jogador;
    /**
    * O número secreto que o jogador deve adivinhar.
    */
    private int numeroSecreto;
    
     /**
     * Construtor da classe Jogo.
     * Inicializa o jogo com o jogador e sorteia um número secreto entre 1 e 100.
     * 
     * @param jogador O jogador que participará do jogo.
     */
    public Jogo(Jogador jogador)
    {
        this.jogador = jogador;
        this.numeroSecreto = new Random().nextInt(100) + 1; 
    }
    
    /**
    * Inicia o jogo e permite ao jogador fazer tentativas.
    * 
    * @param tentativa A tentativa do jogador para adivinhar o número secreto.
    * @return Uma mensagem indicando se o jogador acertou ou se o número é maior/menor.
    */
    public String jogar(int tentativa)
    {
        jogador.incrementarTentativas();
        if(tentativa == numeroSecreto)
        {
            int pontos = Math.max(0, 1000 - (jogador.getTentativas() - 1) * 10);
            jogador.atualizarPontuacao(pontos);
            return "Acertou!";
        } else if (tentativa < numeroSecreto)
        {
            return "O numero é maior!";  
        } else
        {
            return "O numero é menor!";
        }
    }
}