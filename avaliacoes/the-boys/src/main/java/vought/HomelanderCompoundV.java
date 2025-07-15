package vought;

/**
 * Implementação dos poderes básicos e especiais para o personagem {@link Homelander}.
 * 
 * Esta classe define como os poderes são ativados e usados especificamente para
 * o Homelander, incluindo durabilidade, força, velocidade e voo.
 */
public class HomelanderCompoundV implements BasicPower<Homelander>, SpecialPower<Homelander> {

    /**
     * Usa o poder especial do Homelander, neste caso a visão a laser.
     * 
     * @param homelander o objeto Homelander que está usando o poder
     */
    @Override
    public void usePower(Homelander homelander) {
        System.out.println("[Homelander]: Usando visão a laser!");
    }

    /**
     * Ativa a durabilidade do Homelander, definindo sua energia para 100.
     * 
     * @param homelander o objeto Homelander que terá sua energia ativada
     */
    @Override
    public void activateDurability(Homelander homelander) {
        int newDurability = 100;
        homelander.setEnergy(newDurability);
        System.out.println("Energia do Homelander: " + homelander.getEnergy());
    }

    /**
     * Concede força ao Homelander, definindo sua força para 100.
     * 
     * @param homelander o objeto Homelander que receberá a força
     */
    @Override
    public void giveStrength(Homelander homelander) {
        int newStrength = 100;
        homelander.setStrength(newStrength);
        System.out.println("Força do Homelander: " + homelander.getStrength());
    }

    /**
     * Define a velocidade máxima do Homelander para 100.
     * 
     * @param homelander o objeto Homelander que terá sua velocidade ajustada
     */
    @Override
    public void maxSpeed(Homelander homelander) {
        int newSpeed = 100;
        homelander.setSpeed(newSpeed);
        System.out.println("Velocidade do Homelander: " + homelander.getSpeed());
    }

    /**
     *Executa a ação de voo do Homelander, exibindo uma mensagem indicando sua chegada.
     * 
     * @param homelander o objeto Homelander que está voando
     */
    @Override
    public void fly(Homelander homelander) {
        System.out.println("[" + homelander.getNickname() + "]: Ele está vindo!!!");
    }
}
