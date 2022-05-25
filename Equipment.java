public class Equipment extends BasicItem implements PassiveItem
{
	protected int castRange;
	protected int attackDamageBonusForMelee; 
	protected int attackDamageBonusForRange; 
	protected int moveSpeedSlowForRange;
	protected int moveSpeedSlowForMelee;
	protected int damagePerSecond;
	protected int duration;
	protected int armorReduction;
	protected int bonusArmor;
	protected int bonusDamage;
	protected int charges;
	protected int stock;
	protected int stacks;
	protected double bonusManaRegen;
	protected int magicDamageBlock;
	protected int minimumDamageThreshold;
	protected int cooldown;
	protected int attackSpeed;

	public Equipment(String name, int cost, int sellValue, String description, int castRange, int attackDamageBonusForMelee, int attackDamageBonusForRange, int moveSpeedSlowForRange, int moveSpeedSlowForMelee, int damagePerSecond, int duration, int armorReduction, int bonusArmor, int bonusDamage, int charges, int stock, int stacks, double bonusManaRegen, int magicDamageBlock, int minimumDamageThreshold, int cooldown, int attackSpeed)
	{
		super(name, cost, sellValue, description);
		this.castRange = castRange;
		this.attackDamageBonusForMelee = attackDamageBonusForMelee;
		this.attackDamageBonusForRange = attackDamageBonusForRange;
		this.moveSpeedSlowForRange = moveSpeedSlowForRange;
		this.moveSpeedSlowForMelee = moveSpeedSlowForMelee;
		this.damagePerSecond = damagePerSecond;
		this.duration = duration;
		this.armorReduction = armorReduction;
		this.bonusArmor = bonusArmor;
		this.bonusDamage = bonusDamage;
		this.charges = charges;
		this.stock = stock;
		this.stacks = stacks;
		this.bonusManaRegen = bonusManaRegen;
		this.magicDamageBlock = magicDamageBlock;
		this.minimumDamageThreshold = minimumDamageThreshold;
		this.cooldown = cooldown;
		this.attackSpeed = attackSpeed;
	}

	public int getCastRange()
	{
		return castRange;
	}

	public int getAttackDamageBonusForMelee()
	{
		return attackDamageBonusForMelee;
	}

	public int getAttackDamageBonusForRange()
	{
		return attackDamageBonusForRange;
	}

	public int getMoveSpeedSlowForRange()
	{
		return moveSpeedSlowForRange;
	}

	public int getMoveSpeedSlowForMelee()
	{
		return moveSpeedSlowForMelee;
	}

	public int getDamagePerSecond()
	{
		return damagePerSecond;
	}

	public int getDuration()
	{
		return duration;
	}

	public int getArmorReduction()
	{
		return armorReduction;
	}

	public int getBonusArmor()
	{
		return bonusArmor;
	}

	public int getBonusDamage()
	{
		return bonusDamage;
	}

	public int getCharges()
	{
		return charges;
	}

	public int getStock()
	{
		return stock;
	}

	public int getStacks()
	{
		return stacks;
	}

	public double getBonusManaRegen()
	{
		return bonusManaRegen;
	}

	public int getMagicDamageBlock()
	{
		return magicDamageBlock;
	}

	public int getMinimumDamageThreshold()
	{
		return minimumDamageThreshold;
	}

	public int getCoolDown()
	{
		return cooldown;
	}

	public int getAttackSpeed()
	{
		return attackSpeed;
	}

	@Override
	public void addAttributes(BasicItem b, Hero h) 
	{
		//codes to be implemented.	
	}

	@Override
	public void addDamage(BasicItem b, Hero h) 
	{
		h.baseDamage += this.bonusDamage;
	}

	@Override
	public void addArmor(BasicItem b, Hero h) 
	{
		h.baseArmor += this.bonusArmor;		
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