import java.util.Random;

public class Razor extends Hero
{
	Random r = new Random();
	//extends hero class
	//basic attack method to be implemented
	//skills methods to be implemented

	public Razor(String heroName, int hitpoints, int manapoints, int manaRegeneration, int hpRegeneration, int strength, int agility, int intellegence, int gold, int xp, int level, int baseDamage, int baseArmor, String skill1, String skill2, String skill3, String skill4, int firstSkillDamage, int secondSkillDamage, int thirdSkillDamage, int ultSkillDamage, int skill1Level, int skill2Level, int skill3Level, int skill4Level, int movementSpeed, int firstSkillManaCost, int secSkillManaCost, int thirdSkillManaCost, int ultSkillManaCost) 
	{
		super(heroName, hitpoints, manapoints, manaRegeneration, hpRegeneration, strength, agility, intellegence, gold, xp, level, baseDamage, baseArmor, skill1, skill2, skill3, skill4, firstSkillDamage, secondSkillDamage, thirdSkillDamage, ultSkillDamage, skill1Level, skill2Level, skill3Level, skill4Level, movementSpeed, firstSkillManaCost, secSkillManaCost, thirdSkillManaCost, ultSkillManaCost);
	}

	@Override
	public void firstSkill(Hero h) //plasma field
	{
		//code that will reduce puck's hitpoints base on razor's first skill's damage output.
		//System.out.println("Razor used Plasma Field!");
		h.hitpoints -= this.firstSkillDamage;
		this.manapoints -= this.firstSkillManaCost;
	}

	@Override
	public void secondSkill(Hero h)  //static link
	{
		for(int i = 0; i <= 40; i++)
		{
			h.baseDamage -= i;
			this.baseDamage += i;
		}
		this.manapoints -= this.secSkillManaCost;	
	}

	@Override
	public void thirdSkill(Hero h) //storm surge : add a movespeed to a hero.
	{
		this.movementSpeed += 20;	
	}

	@Override
	public void ultimateSkill(Hero h) //eye of the storm
	{
		h.hitpoints -= this.ultSkillDamage;
		this.manapoints -= this.ultSkillManaCost;
	}

	@Override
	public void levelUp(Hero h)
	{
		setLevel(2);
	}

	@Override
	public void attack(Hero h) 
	{
		this.baseDamage -= h.baseArmor;
		h.hitpoints -= this.baseDamage;
	}

	@Override
	public void killedAHero(Hero h)
	{
		this.xp += 150;

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
		this.baseDamage += e.bonusDamage;
		this.baseDamage += e.attackDamageBonusForRange;
		this.baseArmor += e.bonusArmor;
	}

	@Override
	public void buyAttributeItem(Attribute a)
	{
		this.strength += a.bonusStrength;
		this.agility += a.bonusAgility;
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