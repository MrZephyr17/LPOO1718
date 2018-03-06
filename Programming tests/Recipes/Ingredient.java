package recipes;

public abstract class Ingredient implements Comparable<Ingredient> {
		
	protected String name;
	
	public Ingredient(String n)
	{
		if(n==null)
			throw new IllegalArgumentException();
		
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean equals(Ingredient b)
	{
		return b!=null && name.equals(b.getName());
	}
	
	public int compareTo(Ingredient ing)
	{
		return this.name.compareTo(ing.name);
	}
	
	public String toString()
	{
		return name;
	}
}
