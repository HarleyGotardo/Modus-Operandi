public class DireTower extends Tower
{

    public DireTower(int towerTier, int hitpoints, int damage, int armor)
    {
        super(towerTier, hitpoints, damage, armor);
    }

    @Override
    public void destroyed()
    {
        System.out.println("Dire's " + getTowerTier() + " tower has been destroyed!");  
    }

    @Override
    public void attack(Hero hero) 
    {
        this.damage -= hero.baseArmor;
        hero.hitpoints -= this.damage;
    }

    @Override
    public void gotAttackedByHero(Hero h) 
    {
        h.baseDamage -= this.armor;
        this.hitpoints -= h.baseDamage;
    }

    @Override
	public String toString()
	{
		return "DIRE TOWER TIER: " + this.towerTier + "\nHITPOINTS: " + getHitpoints() + 
		"\nDAMAGE: " + getDamage() + "\nARMOR: " + getArmor();
	}
}
