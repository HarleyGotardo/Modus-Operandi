public abstract class Tower extends Ancient
{
	protected int towerTier;
	protected int hitpoints;
	protected int damage;
	protected int armor;

	public Tower(int towerTier, int hitpoints, int damage, int armor)
	{
		this.towerTier = towerTier;
		this.hitpoints = hitpoints;
		this.damage = damage;
		this.armor = armor;
	}

	public int getTowerTier()
	{
		return towerTier;
	}

	public int getHitpoints()
	{
		return hitpoints;
	}

	public int getDamage()
	{
		return damage;
	}

	public int getArmor()
	{
		return armor;
	}

	public void displayTowerDetails()
	{
		//you can either use this method or the toString override
		System.out.println("\nTower tier " + getTowerTier() + " hitpoints: " + getHitpoints());
		System.out.println("\nArmor: " + getArmor());
		System.out.println("\n");
	}

	public abstract void destroyed();
	public abstract void attack(Hero hero);
	public abstract void gotAttackedByHero(Hero hero);

	@Override
	public String toString()
	{
		//u can use this or the displayTowerDetails method.
		return "\nTower tier " + getTowerTier() + " hitpoints: " + getHitpoints() + "\nArmor: " + getArmor();
	}
}