public interface PassiveItem 
{
    public abstract void addAttributes(BasicItem b, Hero h);
    public abstract void addDamage(BasicItem b, Hero h);
    public abstract void addArmor(BasicItem b, Hero h);
    public abstract void addMovementSpeed(Hero h);
    public abstract void addManaRegen(Hero h);
    public abstract void addHpRegen(Hero h);
    public abstract void addMagicResistance(Hero h);
    public abstract void addPhysicalResistance(Hero h);
    public abstract void reduceMovementSpeed(Hero h);
    public abstract void reduceArmor(Hero h);
    public abstract void addAttackSpeed(Hero h);
}
