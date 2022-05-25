import java.util.Random;

public class Razor extends Hero
{
	Random r = new Random();
	//extends hero class
	//basic attack method to be implemented
	//skills methods to be implemented

	public Razor(String heroName, int hitpoints, int manapoints, int manaRegeneration, int hpRegeneration, int strength, int agility, int intellegence, int gold, int xp, int level, int baseDamage, int baseArmor, String skill1, String skill2, String skill3, String skill4, int firstSkillDamage, int secondSkillDamage, int thirdSkillDamage, int ultSkillDamage, int skill1Level, int skill2Level, int skill3Level, int skill4Level, int movementSpeed, Boolean isMelee) 
	{
		super(heroName, hitpoints, manapoints, manaRegeneration, hpRegeneration, strength, agility, intellegence, gold, xp, level, baseDamage, baseArmor, skill1, skill2, skill3, skill4, firstSkillDamage, secondSkillDamage, thirdSkillDamage, ultSkillDamage, skill1Level, skill2Level, skill3Level, skill4Level, movementSpeed, isMelee);
	}

	@Override
	public void firstSkill(Hero h)
	{
		//code that will reduce puck's hitpoints base on razor's first skill's damage output.
		//System.out.println("Razor used Plasma Field!");
	}

	@Override
	public void secondSkill() 
	{
		//skill codes to be implemented		
	}

	@Override
	public void thirdSkill() 
	{
		//skill codes to be implemented		
	}

	@Override
	public void ultimateSkill() 
	{
		//skill codes to be implemented		
	}

	@Override
	public void levelUp(Hero h)
	{
		setLevel(2);
	}

	@Override
	public void attack(Hero h) 
	{
		int finalDamage;
		finalDamage = this.baseDamage;

		if(this.baseDamage < h.baseArmor)
		{
		h.hitpoints -= this.baseDamage;
		baseArmor = 0;
		}

		else if(h.baseArmor > 0)
		{
			finalDamage = this.baseDamage - h.baseArmor;
		}
		h.hitpoints -= finalDamage;
	}

	@Override
	public void killedAHero(Hero h)
	{
		this.xp += 150;

		System.out.println(this.heroName + " killed a hero. Experience gained.");

		h.levelUp(h);
	}

	@Override
	public void killedACreep(Hero h)
	{
		this.xp += 25;

		System.out.println(this.heroName + " killed a creep. Experience gained.");

		h.levelUp(h);
	}

	@Override
	public void attackCreeps(Creep c)
	{
		this.baseDamage -= c.armor;
		c.hitpoints -= this.baseDamage;
	}

	@Override
	public void consecutiveAttacks(int n, Hero h) //application of recursive method.
	{
		if(n > 0)
		{			
			int randomDamage = r.nextInt(47)+1;
			
			randomDamage -= this.baseArmor;

			int update = h.hitpoints -= randomDamage;
			h.hitpoints = update;

			n--;
			consecutiveAttacks(n, h);
		}
	}

	@Override
	public void die(Hero h)
	{
		System.out.println(h.getHeroName() + " has been killed!\n");
		h.respawning(h);
	}

	@Override
	public void respawning(Hero h) 
	{
		System.out.println(h.getHeroName() + " will respawn in: \n");
		for(int i = 12; i > 0; i--)
		{
			System.out.println(i + " seconds.");
			try 
			{
				Thread.sleep(1000);
			} 
			catch (Exception e) {}
		}
		System.out.println("\n" + h.getHeroName() + " has respawned.\n");
	}

	@Override
	public void buyEquipmentItem(Equipment e)
	{
		e.bonusDamage += this.baseDamage;
		e.attackDamageBonusForRange += this.baseDamage;
		e.bonusArmor += this.baseArmor;
	}

	@Override
	public void buyAttributeItem(Attribute a)
	{
		this.strength += a.bonusStrength;
		this.agility  += a.bonusAgility;
		this.intellegence += a.bonusIntelligence;
	}

	@Override
	public void buyConsumableItem(Consumable c) 
	{
		this.manaRegeneration += c.manaRegenBonus;
		this.manapoints += c.manaRestored;
	}

	@Override
	public void buyMiscellaneousItem(Miscellaneous m) 
	{
		this.hpRegeneration += m.healthRegeneration;
		this.manaRegeneration += m.manaRegeneration;
		this.hitpoints += m.addHealth;
	}
}