public class Miscellaneous extends BasicItem
{
	protected int healthRegeneration;
	protected double manaRegeneration;
	protected int addHealth;
	private int radius;
	private int chargesPerCastSpell;
	private int maxCharges;
	private int healthAndManaRestoredPerCharge;
	private int cooldown;

	public Miscellaneous(String name, int cost, int sellValue, String description, int healthRegeneration, double manaRegeneration, int addHealth, int radius, int chargesPerCastSpell, int maxCharges, int healthAndManaRestoredPerCharge, int cooldown)
	{
		super(name, cost, sellValue, description);
		this.healthRegeneration = healthRegeneration;
		this.manaRegeneration = manaRegeneration;
		this.addHealth = addHealth;
		this.radius = radius;
		this.chargesPerCastSpell = chargesPerCastSpell;
		this.maxCharges = maxCharges;
		this.healthAndManaRestoredPerCharge = healthAndManaRestoredPerCharge;
		this.cooldown = cooldown;
	}

	public int getHealthRegeneration()
	{
		return healthRegeneration;
	}

	public double getManaRegeneration()
	{
		return manaRegeneration;
	}

	public int getAddHealth()
	{
		return addHealth;
	}

	public int getRadius()
	{
		return radius;
	}

	public int getChargesPerCastSpell()
	{
		return chargesPerCastSpell;
	}

	public int getMaxCharges()
	{
		return maxCharges;
	}

	public int getHealthAndManaRestoredPerCharge()
	{
		return healthAndManaRestoredPerCharge;
	}

	public int getCoolDown()
	{
		return cooldown;
	}
}
