package vought;

/**
 * Implementação dos poderes básicos e especiais para o personagem Hughie,
 * que é do tipo {@link Hero}.
 * 
 * Esta classe define como os poderes de durabilidade, força, velocidade,
 * voo e um poder especial são ativados para Hughie.
 */
public class HughieCompoundV implements BasicPower<Hero>, SpecialPower<Hero> {

    /**
     * Ativa a durabilidade do herói Hughie, definindo sua energia para 100.
     * 
     * @param hero o objeto Hero que terá a energia ativada
     */
    @Override
    public void activateDurability(Hero hero) {
        hero.setEnergy(100);
        System.out.println("Ganhei energia demais!");
    }

    /**
     * Concede força ao herói Hughie.
     * Implementação ainda não definida.
     * 
     * @param hero o objeto Hero que receberá a força
     */
    @Override
    public void giveStrength(Hero hero) {
        // Implementar lógica de força para Hughie
    }

    /**
     * Define a velocidade máxima do herói Hughie.
     * Implementação ainda não definida.
     * 
     * @param hero o objeto Hero que terá a velocidade ajustada
     */
    @Override
    public void maxSpeed(Hero hero) {
        // Implementar lógica de velocidade para Hughie
    }

    /**
     * Permite que o herói Hughie voe.
     * Implementação ainda não definida.
     * 
     * @param hero o objeto Hero que poderá voar
     */
    @Override
    public void fly(Hero hero) {
        // Implementar lógica de voo para Hughie
    }

    /**
     *Usa o poder especial do Hughie, que neste caso é um teletransporte com efeito cômico.
     * 
     * @param hero o objeto Hero que usará o poder especial
     */
    @Override
    public void usePower(Hero hero) {
        System.out.println("[HUGHIE]: Me teletransportei e fiquei nu!");
    }
}
