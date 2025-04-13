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
            jogador.atualizarPontuacao(1000);
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