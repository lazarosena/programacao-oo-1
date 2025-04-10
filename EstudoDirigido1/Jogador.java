public class Jogador
{
    private String nome;
    private int tentativas;
    private int pontuacao;

    public Jogador(String nome)
    {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    //get-set nome
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    //get-set pontuacao
    public int getPontuacao()
    {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao)
    {
        this.pontuacao = pontuacao;
    }

    //get-set tentativas
    public int getTentativas()
    {
        return tentativas;
    }

    public void setTentativas(int tentativas)
    {
        this.tentativas = tentativas;
    }

    //incrementar
    public void incrementarTentativas() {
        this.tentativas++;
    }

    public void atualizarPontuacao(int valor)
    {
        this.pontuacao += valor;
    }

}