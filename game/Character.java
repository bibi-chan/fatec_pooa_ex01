package strategy.pattern.game;

public abstract class Character {
	
	WeaponBehavior weaponBehavior;
	
	public abstract void fight();

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
}