/**
 * Classe que representa um Mago. Possui ataque mágico poderoso e defesa fraca.
 */
public class Mago extends Personagem {

    /**
     * Construtor do Mago.
     *
     * @param nome Nome do mago.
     */
    public Mago(String nome) {
        super(nome);
        this.ataqueBase = 15;
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " lança um raio mágico causando " + ataqueBase + " de dano.");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " tenta se proteger mas recebe " + dano + " de dano.");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Bola de Fogo! Causa dano em área!");
        // Em um jogo real, aplicaríamos dano em vários inimigos
    }
}