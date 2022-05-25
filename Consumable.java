public class Consumable extends BasicItem implements UsableItem
{
	private int numberOfCharges;
	private int castRange;
	private int duration; 
	protected int manaRegenBonus;
	protected int manaRestored;
	private int visionRadius;
	private int heroAttacksToDestroy; //for the observer ward.
	private int nonHeroAttacksToDestroy; //for the observer ward.
	private int stock;
	private int stacks;


	public Consumable(String name, int cost, int sellValue, String description, int numberOfCharges, int castRange, int duration, int manaRegenBonus, int manaRestored, int visionRadius, int heroAttacksToDestroy, int nonHeroAttacksToDestroy, int stock, int stacks)
	{
		super(name, cost, sellValue, description);
		this.numberOfCharges = numberOfCharges;
		this.castRange = castRange;
		this.duration = duration;
		this.manaRegenBonus = manaRegenBonus;
		this.manaRestored = manaRestored;
		this.visionRadius = visionRadius;
		this.heroAttacksToDestroy = heroAttacksToDestroy;
		this.nonHeroAttacksToDestroy = nonHeroAttacksToDestroy;
		this.stock = stock;
		this.stacks = stacks;
	}

	public int getNumberOfCharges()
	{
		return numberOfCharges;
	}

	public int getCastRange()
	{
		return castRange;
	}

	public int getDuration()
	{
		return duration;
	}

	public int getManaRegenBonus()
	{
		return manaRegenBonus;
	}

	public int getManaRestored()
	{
		return manaRestored;
	}

	public int getVisionRadius()
	{
		return visionRadius;
	}

	public int getHeroAttacksToDestroy()
	{
		return heroAttacksToDestroy;
	}

	public int getNonHeroAttacksToDestroy()
	{
		return nonHeroAttacksToDestroy;
	}

	public int getStock()
	{
		return stock;
	}

	public int getStacks()
	{
		return stacks;
	}

	public void manaRegen(Hero h) 
	{
		h.manaRegeneration += this.manaRegenBonus;
	}

	@Override
	public void useEnchantedMango(Hero h) 
	{		
		h.manapoints += this.manaRestored; 
		//enchanted mango will instantly restore a hero's mana when consumed.
	}

	@Override
	public void manaRegen(BasicItem b, Hero h) 
	{
		h.manapoints += this.manaRestored; 
		//enchanted mango will instantly restore a hero's mana when consumed.
	}
}