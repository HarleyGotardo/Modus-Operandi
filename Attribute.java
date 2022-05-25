public class Attribute extends BasicItem implements PassiveItem 
//since most attribute items are passive that's why i implemented the passiveItem interface here.
{
	protected int bonusStrength;
	protected int bonusAgility;
	protected int bonusIntelligence;

	public Attribute(String name, int cost, int sellValue, String description, int bonusStrength, int bonusAgility, int bonusIntelligence)
	{
		super(name, cost, sellValue, description);
		this.bonusStrength = bonusStrength;
		this.bonusAgility = bonusAgility;
		this.bonusIntelligence = bonusIntelligence;
	}

	public int getBonusStrength()
	{
		return bonusStrength;
	}

	public int getBonusAgility()
	{
		return bonusAgility;
	}

	public int getBonusIntellegence()
	{
		return bonusIntelligence;
	}

	@Override
	public void addAttributes(BasicItem b, Hero h) 
	{
		h.strength += this.bonusStrength;
	}

	@Override
	public void addDamage(BasicItem b, Hero h) 
	{
		//codes to be implemented.
		
	}

	@Override
	public void addArmor(BasicItem b, Hero h) 
	{
		//codes to be implemented.
		
	}

	@Override
	public void addMovementSpeed(Hero h) 
	{
		//codes to be implemented.
		
	}

	@Override
	public void addManaRegen(Hero h) 
	{
		//codes to be implemented.
		
	}

	@Override
	public void addHpRegen(Hero h) 
	{
		//codes to be implemented.
		
	}

	@Override
	public void addMagicResistance(Hero h) 
	{
		//codes to be implemented.
		
	}

	@Override
	public void addPhysicalResistance(Hero h) 
	{
		//codes to be implemented.
		
	}

	@Override
	public void reduceMovementSpeed(Hero h) 
	{
		//codes to be implemented.
		
	}

	@Override
	public void reduceArmor(Hero h) 
	{
		//codes to be implemented.
		
	}

	@Override
	public void addAttackSpeed(Hero h) 
	{
		//codes to be implemented.
		
	}

}