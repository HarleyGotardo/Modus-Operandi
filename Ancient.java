public abstract class Ancient
{
	private String ancientName;
	protected int hitPoints;
	private int armor;

	public String getAncientName()
	{
		return ancientName;
	}

	public int getHitPoints()
	{
		return hitPoints;
	}

	public int getArmor()
	{
		return armor;
	}

	public void setRadiantAttributes(String ancientName, int hitPoints, int armor)
	{
		this.ancientName = ancientName;
		this.hitPoints = hitPoints;
		this.armor = armor;
	}

	public void setDireAttributes(String ancientName, int hitPoints, int armor)
	{
		this.ancientName = ancientName;
		this.hitPoints = hitPoints;
		this.armor = armor;
	}

	public void radiantIsDestroyed(Radiant r)
	{
		if(r.hitPoints == 0)
		{
			System.out.println("Dire Victory!");
		}
	}

	public void direIsDestroyed(Dire d)
	{
		if(d.hitPoints == 0)
		{
			System.out.println("Dire Victory!");
		}
	}

	public void activateFortification(Hero h, Creep c, Tower t)
	{
		h.baseDamage = 0;
        c.atkDamage = 0;
        t.damage = 0;
	}

	@Override
	public String toString()
	{
		return "ANCIENT: " + this.ancientName + "\nHITPOINTS: " + this.hitPoints + "\nARMOR: "
		+ this.armor;
	}
}
