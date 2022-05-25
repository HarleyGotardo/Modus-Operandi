public abstract class Hero
{
	protected final String heroName;
	protected int hitpoints;
	protected int manapoints;
	protected double manaRegeneration;
	protected double hpRegeneration;
	protected int strength;
	protected int agility;
	protected int intellegence;
	private int gold;
	protected int xp;
	private int level;
	protected int baseDamage;
	protected int baseArmor;
	private String skill1;
	private String skill2;
	private String skill3;
	private String skill4;
	private int firstSkillDamage;
	private int secondSkillDamage;
	private int thirdSkillDamage;
	private int ultSkillDamage;
	private int skill1Level;
	private int skill2Level;
	private int skill3Level;
	private int skill4Level;
	protected int movementSpeed;
	protected Boolean isMelee;

	public Hero(String heroName, int hitpoints, int manapoints, int manaRegeneration, int hpRegeneration, int strength, int agility, int intellegence, int gold, int xp, int level, int baseDamage, int baseArmor, String skill1, String skill2, String skill3, String skill4, int firstSkillDamage, int secondSkillDamage, int thirdSkillDamage, int ultSkillDamage, int skill1Level, int skill2Level, int skill3Level, int skill4Level, int movementSpeed, Boolean isMelee)
	{
		this.heroName = heroName;
		this.hitpoints = hitpoints;
		this.manapoints = manapoints;
		this.manaRegeneration = manaRegeneration;
		this.hpRegeneration = hpRegeneration;
		this.strength = strength;
		this.agility = agility;
		this.intellegence = intellegence;
		this.gold = gold;
		this.xp = xp;
		this.level = level;
		this.baseDamage = baseDamage;
		this.baseArmor = baseArmor;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.skill4 = skill4;
		this.firstSkillDamage = firstSkillDamage;
		this.secondSkillDamage = secondSkillDamage;
		this.thirdSkillDamage = thirdSkillDamage;
		this.ultSkillDamage = ultSkillDamage;
		this.skill1Level = skill1Level;
		this.skill2Level = skill2Level;
		this.skill3Level = skill3Level;
		this.skill4Level = skill4Level;
		this.movementSpeed = movementSpeed;
		this.isMelee = isMelee;
	}

	public String getHeroName()
	{
		return heroName;
	}

	public int getHitpoints()
	{
		return hitpoints;
	}

	public int getManapoints()
	{
		return manapoints;
	}

	public int getStrength()
	{
		return strength;
	}

	public int getAgility()
	{
		return agility;
	}

	public int getIntellegence()
	{
		return intellegence;
	}

	public int getGold()
	{
		return gold;
	}

	public int getXp()
	{
		return xp;
	}

	public int getLevel()
	{
		return level;
	}

	public int getBaseDamage()
	{
		return baseDamage;
	}

	public int getBaseArmor()
	{
		return baseArmor;
	}

	public String getSkill1()
	{
		return skill1;
	}

	public String getSkill2()
	{
		return skill2;
	}

	public String getSkill3()
	{
		return skill3;
	}

	public String getSkill4()
	{
		return skill4;
	}

	public int getFirstSkillDamage()
	{
		return firstSkillDamage;
	}

	public int getSecondSkillDamage()
	{
		return secondSkillDamage;
	}

	public int getThirdSkillDamage()
	{
		return thirdSkillDamage;
	}

	public int getUltSkillDamage()
	{
		return ultSkillDamage;
	}

	public int getSkill1Level()
	{
		return skill1Level;
	}

	public int getSkill2Level()
	{
		return skill2Level;
	}

	public int getSkill3Level()
	{
		return skill3Level;
	}

	public int getSkill4Level()
	{
		return skill4Level;
	}

	public int getMovementSpeed()
	{
		return movementSpeed;
	}

	public Boolean getIsMelee()
	{
		return isMelee;
	}

	public double getManaRegeneration()
	{
		return manaRegeneration;
	}

	public double getHpRegeneration()
	{
		return hpRegeneration;
	}

	public void setLevel(int currentLevel)
	{
		this.level = currentLevel;
	}
	
	public void displayHeroDetails()
	{
		System.out.println("HERO: " + getHeroName() + "\nLEVEL: " + getLevel() + "\nEXPERIENCE: " + getXp() + "\nHITPOINTS: " + getHitpoints() + "\nStrength: " + getStrength() + "\nAgility: " + getAgility() + "\nIntelligence: " + getIntellegence() + "\nMANA: " + getManapoints() + "\nMANA REGENERATION: " + getManaRegeneration() + "\nDAMAGE: " + getBaseDamage() + "\nARMOR: " + getBaseArmor() + "\nMOVESPEED: " + getMovementSpeed() + "\n");
	}

	public abstract void attack(Hero h);
	public abstract void killedAHero(Hero h);
	public abstract void killedACreep(Hero h);
	public abstract void attackCreeps(Creep c);
	public abstract void firstSkill(Hero h);
	public abstract void secondSkill();
	public abstract void thirdSkill();
	public abstract void ultimateSkill();
	public abstract void levelUp(Hero h);
	public abstract void consecutiveAttacks(int n, Hero h);
	public abstract void die(Hero h);
	public abstract void respawning(Hero h);
	public abstract void buyEquipmentItem(Equipment e);
	public abstract void buyAttributeItem(Attribute a);
	public abstract void buyConsumableItem(Consumable c);
	public abstract void buyMiscellaneousItem(Miscellaneous m);

	@Override
	public String toString()
	{
		return "HERO: " + getHeroName() + "\nLEVEL: " + getLevel() + "\nEXPERIENCE: " + getXp() + "\nHITPOINTS: " + getHitpoints() + "\nStrength: " + getStrength() + "\nAgility: " + getAgility() + "\nIntelligence: " + getIntellegence() + "\nMANA: " + getManapoints() + "\nMANA REGENERATION: " + getManaRegeneration() + "\nDAMAGE: " + getBaseDamage() + "\nARMOR: " + getBaseArmor() + "\nMOVESPEED: " + getMovementSpeed() + "\n";
	}
}