public abstract class BasicItem
{
	private String name;
	private int cost;
	private int sellValue;
	private String description;

	public BasicItem(String name, int cost, int sellValue, String description)
	{
		this.name = name;
		this.cost = cost;
		this.sellValue = sellValue;
		this.description = description;
	}

	public String getName()
	{
		return name;
	}

	public int getCost()
	{
		return cost;
	}

	public int getSellValue()
	{
		return sellValue;
	}

	public String getDescription()
	{
		return description;
	}
}