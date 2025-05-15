p/**
 * Classe principal para testar o sistema de personagens de RPG.
 */
public class MainRpg {
    /**
     * Método principal.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        System.out.println("\n--- Status Inicial ---");
        g.status();
        m.status();
        a.status();

        System.out.println("\n--- Combate ---");
        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        System.out.println("\n--- Status Final ---");
        g.status();
        m.status();
        a.status();
    }
}