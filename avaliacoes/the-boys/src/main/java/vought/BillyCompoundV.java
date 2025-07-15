package vought;

/**
 * Classe que representa o personagem Billy Compound V, 
 * que implementa poderes básicos e especiais para heróis.
 * 
 * Implementa a interface {@link BasicPower} e {@link SpecialPower}
 * para um tipo genérico {@code Hero}.
 */
public class BillyCompoundV implements BasicPower<Hero>, SpecialPower<Hero> {

    /**
     * Ativa a durabilidade do herói, definindo sua energia para 100.
     * 
     * @param hero o herói que terá a energia ativada
     */
    @Override
    public void activateDurability(Hero hero) {
        hero.setEnergy(100);
        System.out.println("Ganhei energia demais!");
    }

    /**
     * Concede força ao herói.
     * Implementação ainda não definida.
     * 
     * @param hero o herói que receberá a força
     */
    @Override
    public void giveStrength(Hero hero) {
        // Implementar lógica de força
    }

    /**
     * Define a velocidade máxima do herói.
     * Implementação ainda não definida.
     * 
     * @param hero o herói que terá a velocidade máxima ajustada
     */
    @Override
    public void maxSpeed(Hero hero) {
        // Implementar lógica de velocidade
    }

    /**
     * Permite que o herói voe.
     * Implementação ainda não definida.
     * 
     * @param hero o herói que poderá voar
     */
    @Override
    public void fly(Hero hero) {
        // Implementar lógica de voo
    }

    /**
     *Usa o poder especial do herói.
     * Implementação ainda não definida.
     * 
     * @param hero o herói que usará o poder especial
     */
    @Override
    public void usePower(Hero hero) {
        // Implementar lógica do poder especial
    }
}
