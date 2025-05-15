/**
 * Classe que representa um Guerreiro. Possui ataque físico forte e defesa aprimorada.
 */
public class Guerreiro extends Personagem {

    /**
     * Construtor do Guerreiro.
     *
     * @param nome Nome do guerreiro.
     */
    public Guerreiro(String nome) {
        super(nome);
        this.ataqueBase = 20;
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca com espada causando " + ataqueBase + " de dano.");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        int danoFinal = dano / 2;
        hp -= danoFinal;
        System.out.println(nome + " defende com armadura e recebe apenas " + danoFinal + " de dano.");
    }

    @Override
    public void usarHabilidadeEspecial() {
        int dano = ataqueBase * 2;
        System.out.println(nome + " usa Golpe Duplo causando " + dano + " de dano!");
        // A habilidade requer um inimigo alvo, mas para este exemplo simplificamos
    }
}