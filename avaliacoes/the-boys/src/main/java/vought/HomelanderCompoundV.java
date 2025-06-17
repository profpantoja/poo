package vought;
/**
 * Classe que representa um herói "HomelanderCompoundV" e que implementa uma lista de Poderes Básicos e Poderes Especiais com base em "Capitão Pátria (HomeLander)"
 */
public class HomelanderCompoundV implements BasicPower<Homelander>, SpecialPower<Homelander> {
    
    /**
     * Método que ativa o poder no personagem.
     */
    public void usePower(Homelander homelander) {
        System.out.println("[Homelander]: Usando visão a laser!");
    }

    /**
	 * Método que ativa a força aprimorada no personagem.
	 * @param homelander "Herói", que receberá o valor de aprimorada.
	 */
    @Override
    public void activateDurability(Homelander homelander) {
        int newDurability = 100;
        homelander.setEnergy(newDurability);
        System.out.println("Energia do Homelander: " + homelander.getEnergy());
    }

    /**
	 * Método que ativa a força aprimorada no personagem.
	 * @param homelander "Herói", que receberá o valor de força.
	 */
    @Override
    public void giveStrength(Homelander homelander) {
        int newStrength = 100;
        homelander.setStrength(newStrength);
        System.out.println("Força do Homelander: " + homelander.getStrength());
    }

    /**
	 * Método que ativa a velocidade máxima no personagem.
	 * @param homelander "Herói", que receberá o valor de velocidade máxima.
	 */
    @Override
    public void maxSpeed(Homelander homelander) {
        int newSpeed = 100;
        homelander.setSpeed(newSpeed);
        System.out.println("Velocidade do Homelander: " + homelander.getSpeed());
    }

    /**
	 * Método que ativa o voo no personagem.
	 * @param homelander "Herói", que receberá o valor de voo.
	 */
    @Override
    public void fly(Homelander homelander) {
        System.out.println("[" + homelander.getNickname() + "]: Ele está vindo!!!");
    }

}
