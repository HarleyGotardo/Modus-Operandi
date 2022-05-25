public class MeleeCreep extends Creep
{
    public MeleeCreep(int atkDamage, int armor, int hitpoints) 
    {
        super(atkDamage, armor, hitpoints);
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

