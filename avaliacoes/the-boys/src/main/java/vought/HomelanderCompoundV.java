package vought;

public class HomelanderCompoundV implements BasicPower<Homelander>, SpecialPower<Homelander> {

    public void usePower(Homelander homelander) {
        System.out.println("[Homelander]: Usando visão a laser!");
    }

    @Override
    public void activateDurability(Homelander homelander) {
        int newDurability = 100;
        homelander.setEnergy(newDurability);
        System.out.println("Energia do Homelander: " + homelander.getEnergy());
    }

    @Override
    public void giveStrength(Homelander homelander) {
        int newStrength = 100;
        homelander.setStrength(newStrength);
        System.out.println("Força do Homelander: " + homelander.getStrength());
    }

    @Override
    public void maxSpeed(Homelander homelander) {
        int newSpeed = 100;
        homelander.setSpeed(newSpeed);
        System.out.println("Velocidade do Homelander: " + homelander.getSpeed());
    }

    @Override
    public void fly(Homelander homelander) {
        System.out.println("[" + homelander.getNickname() + "]: Ele está vindo!!!");
    }

}
