import java.util.Random;

/**
 * Classe que representa um Arqueiro. Possui ataque com chance de crítico.
 */
public class Arqueiro extends Personagem {
    private Random rand = new Random();

    /**
     * Construtor do Arqueiro.
     *
     * @param nome Nome do arqueiro.
     */
    public Arqueiro(String nome) {
        super(nome);
        this.ataqueBase = 12;
    }

    @Override
    public void atacar(Personagem inimigo) {
        boolean critico = rand.nextInt(100) < 25; // 25% de chance de crítico
        int dano = critico ? ataqueBase * 2 : ataqueBase;
        System.out.println(nome + " dispara flecha" + (critico ? " CRÍTICA" : "") + " causando " + dano + " de dano.");
        inimigo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " tenta esquivar mas recebe " + dano + " de dano.");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas!");
        for (int i = 1; i <= 3; i++) {
            int dano = ataqueBase;
            System.out.println(" → Flecha " + i + " causa " + dano + " de dano.");
        }
    }
}