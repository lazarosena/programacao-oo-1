/**
 * Classe abstrata que representa um personagem de RPG.
 */
public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    /**
     * Construtor da classe Personagem.
     *
     * @param nome Nome do personagem.
     */
    public Personagem(String nome) {
        this.nome = nome;
        this.hp = 100;
        this.ataqueBase = 10;
    }

    /**
     * Ataca outro personagem.
     *
     * @param inimigo O personagem inimigo a ser atacado.
     */
    public abstract void atacar(Personagem inimigo);

    /**
     * Defende um ataque recebendo dano.
     *
     * @param dano Dano a ser recebido.
     */
    public abstract void defender(int dano);

    /**
     * Usa a habilidade especial do personagem.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Exibe o status atual do personagem.
     */
    public void status() {
        System.out.println("[" + getClass().getSimpleName() + "] " + nome + " | HP: " + hp);
    }

    /**
     * Verifica se o personagem está vivo.
     *
     * @return true se o HP for maior que 0.
     */
    public boolean estaVivo() {
        return hp > 0;
    }
}