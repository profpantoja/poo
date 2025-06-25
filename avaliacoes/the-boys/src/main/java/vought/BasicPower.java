package vought;

public interface BasicPower<Type> {

	public abstract void activateDurability(Type T);

	public abstract void giveStrength(Type T);

	public abstract void maxSpeed(Type T);

	public abstract void fly(Type T);

}
