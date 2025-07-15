package vought;

/**
 * Implementação dos poderes básicos e especiais para o personagem {@link StarLight}.
 * 
 * Esta classe define os métodos para ativar durabilidade, conceder força,
 * definir velocidade máxima, executar voo e usar um poder especial para o StarLight.
 */
public class StarLightCompoundV implements BasicPower<StarLight>, SpecialPower<StarLight> {

    /**
     * Ativa a durabilidade do StarLight.
     * 
     * @param starLight o objeto StarLight que terá a durabilidade ativada
     */
    @Override
    public void activateDurability(StarLight starLight) {
        // Implementar lógica para ativar durabilidade
    }

    /**
     * Concede força ao StarLight.
     * 
     * @param starLight o objeto StarLight que receberá força
     */
    @Override
    public void giveStrength(StarLight starLight) {
        // Implementar lógica para conceder força
    }

    /**
     * Define a velocidade máxima do StarLight.
     * 
     * @param starLight o objeto StarLight que terá a velocidade ajustada
     */
    @Override
    public void maxSpeed(StarLight starLight) {
        // Implementar lógica para definir velocidade máxima
    }

    /**
     * Executa a ação de voo do StarLight.
     * 
     * @param starLight o objeto StarLight que estará voando
     */
    @Override
    public void fly(StarLight starLight) {
        // Implementar lógica para o voo
    }

    /**
     *Usa o poder especial do StarLight.
     * 
     * @param starLight o objeto StarLight que usará o poder especial
     */
    @Override
    public void usePower(StarLight starLight) {
        // Implementar lógica do poder especial
    }
}
