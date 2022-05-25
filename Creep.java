public abstract class Creep extends Ancient
{
    protected int atkDamage;
    protected int armor;
    protected int hitpoints;

    public Creep(int atkDamage, int armor, int hitpoints)
    {
        this.atkDamage = atkDamage;
        this.armor = armor;
        this.hitpoints = hitpoints;
    }

    public int getAtkDamage()
    {
        return atkDamage;
    }

    public int getArmor()
    {
        return armor;
    }

    public int getHitpoints()
    {
        return hitpoints;
    }

    public abstract void attackCreeps(Creep c);
    public abstract void attackHero(Hero h);
    public void spawnRadiantCreep()
    {
        Creep mCreep = new MeleeCreep(25, 2, 300);
		Creep mCreep2 = new MeleeCreep(25, 2, 300);
		Creep mCreep3 = new MeleeCreep(25, 2, 300);
		Creep mCreep4 = new MeleeCreep(25, 2, 300);
		Creep rCreep = new RangeCreep(30, 1, 250, 100);

        Creep[] radiantCreeps = {mCreep, mCreep2, mCreep3, mCreep4, rCreep};   
    }

    public void spawnDireCreep()
    {
        Creep mCreep = new MeleeCreep(25, 2, 300);
		Creep mCreep2 = new MeleeCreep(25, 2, 300);
		Creep mCreep3 = new MeleeCreep(25, 2, 300);
		Creep mCreep4 = new MeleeCreep(25, 2, 300);
		Creep rCreep = new RangeCreep(30, 1, 250, 100);

		Creep[] direCreeps = {mCreep, mCreep2, mCreep3, mCreep4, rCreep};    
    }

    public void fortified(Hero h, Creep c, Tower t)
    {
        h.baseDamage = 0;
        c.atkDamage = 0;
        t.damage = 0;
        //creeps will be invulnerable if fortification is activated.
    }

    @Override
	public String toString()
	{
		return "Creep hp: " + getHitpoints();
	}
}