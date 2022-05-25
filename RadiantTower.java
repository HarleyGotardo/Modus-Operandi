public class RadiantTower extends Tower
{
    public RadiantTower(int towerTier, int hitpoints, int damage, int armor) 
    {
        super(towerTier, hitpoints, damage, armor);
    }
    
    @Override
    public void destroyed()
    {
        System.out.println("Radiant's tier " + getTowerTier() + " tower has been destroyed!");
    }

    @Override
    public void attack(Hero h)
    {
        this.damage -= h.baseArmor;
        h.hitpoints -= this.damage;
    }

    @Override
    public void gotAttackedByHero(Hero h)
    {
        h.baseDamage -= this.armor;
        this.hitpoints -= h.baseDamage;

        if(this.hitpoints == 0)
        {
            destroyed();
        }
    }

    @Override
	public String toString()
	{
		return "RADIANT TOWER TIER: " + this.towerTier + "\nHITPOINTS: " + getHitpoints() + 
		"\nDAMAGE: " + getDamage() + "\nARMOR: " + getArmor();
	}
}
