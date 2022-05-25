public class RangeCreep extends Creep
{
    private int manapoints;

    public RangeCreep(int atkDamage, int armor, int hitpoints, int manapoints) 
    {
        super(atkDamage, armor, hitpoints);
        this.manapoints = manapoints;
    }
    
    public int getManaPoints()
    {
        return manapoints;
    }

    @Override
    public void attackCreeps(Creep c) 
    {
        this.atkDamage -= c.armor;
        c.hitpoints -= this.atkDamage;
    }

    @Override
    public void attackHero(Hero h) 
    {
        this.atkDamage -= h.baseArmor;
        h.hitpoints -= this.atkDamage;
    }
}
