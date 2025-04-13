import java.util.Random;

public class Jogo
{
    private Jogador jogador;
    private int numeroSecreto;
    
    public Jogo(Jogador jogador)
    {
        this.jogador = jogador;
        this.numeroSecreto = new Random().nextInt(100) + 1; 
    }
    
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