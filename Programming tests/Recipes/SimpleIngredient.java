package recipes;

public class SimpleIngredient extends Ingredient {
		
	public SimpleIngredient(String n)
	{
		super(n);
	}
	
	public boolean equals(Object b)
	{
		return b!=null && name.equals(((SimpleIngredient) b).getName());
	}
}
