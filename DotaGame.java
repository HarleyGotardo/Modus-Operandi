public class DotaGame
{
	public static void main(String[]args)
	{
		//Initialization of the Radiant's hero:
		Hero razor = new Razor("Razor, The Lightning Revenant", 640, 327, 1, 2, 22, 27, 23, 600, 0, 1, 47, 3, "Plasma Field", "Static Link", "Storm Surge", "Eye of the Storm", 80, 0, 0, 60, 0, 0, 0, 0, 350);
		//heroName, hitpoints, manapoints, manaRegeneration, hpRegeneration, strength, agility, intellegence, gold, xp, level, baseDamage, baseArmor, skill1, skill2, skill3, skill4, firstSkillDamage, secondSkillDamage, thirdSkillDamage, ultSkillDamage, skill1Level, skill2Level, skill3Level, skill4Level, movementSpeed, isMelee
		
		//Instantiation of the Dire's hero:
		Hero puck = new Puck("Puck, The Faerie Dragon", 540, 351, 2, 3, 17, 22, 23, 600, 0, 1, 45, 2, "Illusory Orb", "Waning Rift", "Phase Shift", "Dream Coil", 75, 70, 0, 125, 0, 0, 0, 0, 325); 
		//heroName, hitpoints, manapoints, manaRegeneration, hpRegeneration, strength, agility, intellegence, gold, xp, level, baseDamage, baseArmor, skill1, skill2, skill3, skill4, firstSkillDamage, secondSkillDamage, thirdSkillDamage, ultSkillDamage, skill1Level, skill2Level, skill3Level, skill4Level, movementSpeed, isMelee
		
		//The Radiant's attributes and initialization:
		Ancient radiant = new Radiant();
		radiant.setRadiantAttributes("Radiant", 4250, 13); //hitpoints, armor

		//The Dire's attributes and initialization:
		Ancient dire = new Dire(); 
		dire.setDireAttributes("Dire", 4250, 13); //hitpoints, armor

		//Initialization of Radiant towers:
		RadiantTower Rt1 = new RadiantTower (1, 1800, 88, 12); //towertier, hitpoints, damage, armor
		RadiantTower Rt2 = new RadiantTower (2, 2500, 170, 16); //towertier, hitpoints, damage, armor
		RadiantTower Rt3 = new RadiantTower (3, 2600, 171, 16); //towertier, hitpoints, damage, armor
		RadiantTower Rt4a = new RadiantTower (4, 2700, 180, 20); //towertier, hitpoints, damage, armor
		RadiantTower Rt4b = new RadiantTower (4, 2700, 180, 20); //towertier, hitpoints, damage, armor

		//Initialization of Radiant tower:
		DireTower Dt1 = new DireTower (1, 1800, 88, 12); //towertier, hitpoints, damage, armor
		DireTower Dt2 = new DireTower (2, 2500, 170, 16); //towertier, hitpoints, damage, armor
		DireTower Dt3 = new DireTower (3, 2600, 171, 16); //towertier, hitpoints, damage, armor
		DireTower Dt4a = new DireTower (4, 2700, 180, 20); //towertier, hitpoints, damage, armor
		DireTower Dt4b = new DireTower (4, 2700, 180, 20); //towertier, hitpoints, damage, armor

		//Radiant's Tower Details:
		System.out.print("\n");
		System.out.println(Rt1);
		System.out.println("_______________________________________________________________________________");
		System.out.println(Rt2);
		System.out.println("_______________________________________________________________________________");
		System.out.println(Rt3);
		System.out.println("_______________________________________________________________________________");
		System.out.println(Rt4a);
		System.out.println("_______________________________________________________________________________");
		System.out.println(Rt4b);

		//Dire's Tower Details:
		System.out.print("\n");
		System.out.println(Dt1);
		System.out.println("_______________________________________________________________________________");
		System.out.println(Dt2);
		System.out.println("_______________________________________________________________________________");
		System.out.println(Dt3);
		System.out.println("_______________________________________________________________________________");
		System.out.println(Dt4a);
		System.out.println("_______________________________________________________________________________");
		System.out.println(Dt4b);

		//Radiant and Dire Creeps: note: 'm' means melee and 'r' means range.

		Creep mCreep = new MeleeCreep(25, 2, 300);
		Creep mCreep2 = new MeleeCreep(25, 2, 300);
		Creep mCreep3 = new MeleeCreep(25, 2, 300);
		Creep mCreep4 = new MeleeCreep(25, 2, 300);
		Creep rCreep = new RangeCreep(30, 1, 250, 100);

		Creep[] radiantCreeps = {mCreep, mCreep2, mCreep3, mCreep4, rCreep};
		Creep[] direCreeps = {mCreep, mCreep2, mCreep3, mCreep4, rCreep};

		//ITEMS:
			//Consumables:
		Consumable clarityPotion = new Consumable("Clarity Potion", 50, 25, "add mana overtime", 1, 250, 25, 6, 0, 0, 0, 0, 1, 0);
		Consumable enchantedMango = new Consumable("Enchanted Mango", 75, 35, "instantly add mana", 1, 400, 0, 0, 100, 0, 0, 0, 2, 1);
		Consumable observerWard = new Consumable("Observer Ward", 0, 0, "grants vision", 1, 500, 360, 0, 0, 1400, 2, 8, 2, 1);
		Consumable sentryWard = new Consumable("Sentry Ward", 50, 25, "grants vision that can see invisible units", 1, 500, 420, 0, 0, 1400, 2, 8, 10, 1);


			//Equipment items:
		Equipment quellingBlade = new Equipment("Quelling Blade", 100, 50, "add damage to non-hero units", 8, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0);
		Equipment blightStone = new Equipment("Blight Stone", 300, 150, "grants armor reduction every attack", 0, 0, 0, 0, 0, 0, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Equipment ringOfProtection = new Equipment("Ring of Protection", 175, 87, "grants armor", 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Equipment bladesOfAttack = new Equipment("Blades of Attack", 450, 225, "add damage", 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0);
		Equipment chainmail = new Equipment("Chainmail", 550, 275, "grants armor", 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Equipment infusedRainDrops = new Equipment("Infused Raindrops", 225, 18, "grants magic resistance", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 1, 1, 0.8, 120, 75, 0, 0);
		Equipment quarterstaff = new Equipment("Quarterstaff", 875, 437, "add damage", 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 10);
		Equipment broadsword = new Equipment("Broadsword", 1000, 500, "add damage", 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0);

			//Miscellaneous items:
		Miscellaneous ringOfRegen = new Miscellaneous("Ring of Regeneration", 175, 87, "grants hp regeneration", 1, 0, 0, 0, 0, 0, 0, 0);
		Miscellaneous sageMask = new Miscellaneous("Sage's Mask", 175, 87, "grants mana regeneration", 0, 0.7, 0, 0, 0, 0, 0, 0);
		Miscellaneous fluffyHat = new Miscellaneous("Fluffy Hat", 250, 125, "add hitpoints", 0, 0, 125, 0, 0, 0, 0, 0);
		Miscellaneous magicStick = new Miscellaneous("Magic Stick", 200, 100, "grants magic wand charges to restore health and mana", 0, 0, 0, 1200, 1, 10, 15, 13);

			//Attribute items:
		Attribute ironWoodBranch = new Attribute("Iron Wood Branch", 50, 25, "add point to all attributes", 1, 1, 1);
		Attribute ogreAxe = new Attribute("Ogre Axe", 1000, 500, "add strength" , 10, 0, 0);
		Attribute gauntletOfStrength = new Attribute("Gauntlet of Strength", 140, 70, "add strength", 3, 0, 0);

		//The radiant, dire and their own respective hero.
		System.out.print("\n");
		System.out.println(radiant + "\n");
		System.out.println(razor);
		System.out.println("_______________________________________________________________________________");
		System.out.print("\n");
		System.out.println(dire + "\n");
		System.out.println(puck);
		System.out.println("_______________________________________________________________________________");

		System.out.println("GAME PROGRESS: \n");
		
		//AVAILABLE METHODS TO BE CALLED:
		//puck.attack(razor);
		//razor.attack(puck);
		//puck.consecutiveAttacks(n, razor); //change 'n' to any number.
		//razor.consecutiveAttacks(n, puck); //change 'n' to any number.
		//Rt1.attack(razor); //you can also change "razor" to "puck"
		//Rt2.attack(razor); //you can also change "razor" to "puck"
		//Rt3.attack(razor); //you can also change "razor" to "puck"
		//Rt4a.attack(razor); //you can also change "razor" to "puck"
		//Rt4b.attack(razor); //you can also change "razor" to "puck"
		//Dt1.attack(razor); //you can also change "razor" to "puck"
		//Dt2.attack(razor); //you can also change "razor" to "puck"
		//Dt3.attack(razor); //you can also change "razor" to "puck"
		//Dt4a.attack(razor); //you can also change "razor" to "puck"
		//Dt4b.attack(razor); //you can also change "razor" to "puck"
		//rCreep.attackCreeps(c); //add the creep variable name parameter
		//mCreep.attackCreeps(c); //add the creep variable name parameter
		//mCreep2.attackCreeps(c); //add the creep variable name parameter
		//mCreep3.attackCreeps(c); //add the creep variable name parameter
		//mCreep4.attackCreeps(c); //add the creep variable name parameter
		//ogreAxe.addAttributes(ogreAxe, razor); //you can also change "razor" to "puck"
		//broadsword.addDamage(broadsword, puck); //you can also change "puck" to "razor"
		//razor.die(razor);
		//puck.die(puck);
		//<heroName>.levelUp(<heroName>);

		//Calling of methods here:
		clarityPotion.manaRegen(clarityPotion, razor);
		razor.buyAttributeItem(ogreAxe);
		puck.buyConsumableItem(enchantedMango);
		razor.attack(puck);
	}
}