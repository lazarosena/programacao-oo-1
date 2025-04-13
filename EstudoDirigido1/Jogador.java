/**
 * A classe Jogador representa um jogador que participa do jogo.
 * Ela armazena informações como o nome, o número de tentativas e a pontuação do jogador.
 */
public class Jogador
{
    private String nome;
    private int tentativas;
    private int pontuacao;

     /**
     * Construtor da classe Jogador.
     * Inicializa o nome do jogador, o número de tentativas e a pontuação.
     * 
     * @param nome O nome do jogador.
     */
    public Jogador(String nome)
    {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    /**
     * Retorna o nome do jogador.
     * 
     * @return O nome do jogador.
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * Define o nome do jogador.
     * 
     * @param nome O nome a ser atribuído ao jogador.
     */
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    /**
     * Retorna a pontuação do jogador.
     * 
     * @return A pontuação do jogador.
     */
    public int getPontuacao()
    {
        return pontuacao;
    }

    /**
     * Define a pontuação do jogador.
     * 
     * @param pontuacao A pontuação a ser atribuída ao jogador.
     */
    public void setPontuacao(int pontuacao)
    {
        this.pontuacao = pontuacao;
    }

    /**
     * Retorna o número de tentativas do jogador.
     * 
     * @return O número de tentativas do jogador.
     */
    public int getTentativas()
    {
        return tentativas;
    }

    /**
     * Define o número de tentativas do jogador.
     * 
     * @param tentativas O número de tentativas a ser atribuído ao jogador.
     */
    public void setTentativas(int tentativas)
    {
        this.tentativas = tentativas;
    }

    /**
     * Incrementa o número de tentativas do jogador.
     * Esse método é chamado toda vez que o jogador faz uma nova tentativa.
     */
    public void incrementarTentativas() {
        this.tentativas++;
    }

     /**
     * Atualiza a pontuação do jogador.
     * A pontuação é incrementada pelo valor fornecido como parâmetro.
     * 
     * @param valor O valor a ser somado à pontuação do jogador.
     */
    public void atualizarPontuacao(int valor)
    {
        this.pontuacao += valor;
    }

}