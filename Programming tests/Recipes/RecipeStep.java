package recipes;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class RecipeStep implements Comparable<RecipeStep>{

	private String name;
	private String action;
	private TreeMap<Ingredient, Float> ingredients;
	private TreeMap<RecipeStep, Float> otherRecipes;

	public RecipeStep(String n, String a)
	{
		if(n == null || a == null)
			throw new IllegalArgumentException();

		name = n;
		action = a;
		ingredients = new TreeMap<Ingredient, Float>();
		otherRecipes = new TreeMap<RecipeStep, Float>();
	}

	public String getName()
	{
		return name;
	}

	public String getAction()
	{
		return action;
	}

	public int getIngredientCount()
	{
		return ingredients.size();
	}

	public void addIngredient(Ingredient ing, float q)
	{
		if(ingredients.containsKey(ing))
			return;

		ingredients.put(ing, q);
	}

	public boolean existsR(Ingredient ing)
	{
		for(Map.Entry<RecipeStep, Float> pair : otherRecipes.entrySet())
		{
			if(pair.getKey().ingredients.containsKey(ing))
				return true;
		}

		return false;
	}

	public void addIngredient(RecipeStep ing, float q)
	{
		if(otherRecipes.containsKey(ing))
			return;

		otherRecipes.put(ing, q);

		for(Map.Entry<Ingredient, Float> pair : ing.ingredients.entrySet())
			addIngredient(pair.getKey(), pair.getValue()*q);
	}

	public float getQuantity(Ingredient ing)
	{		
		return ingredients.get(ing) == null ? 0 : ingredients.get(ing);
	}

	public float getQuantity(RecipeStep ing)
	{
		return otherRecipes.get(ing) == null ? 0 : otherRecipes.get(ing);
	}

	public String toString()
	{
		String description = "";

		description = "to make " + name + ", " + action + " ";

		for(Map.Entry<RecipeStep, Float> pair : otherRecipes.entrySet()) 
		{
			description+=pair.getValue() + " " + pair.getKey().getName() + ", ";
		}


		for(Map.Entry<Ingredient, Float> pair : ingredients.entrySet())
		{
			if(!existsR(pair.getKey()))
				description+=pair.getValue() + " " + pair.getKey() + ", ";
		}

		return description.substring(0, description.length()-2);
	}

	public int compareTo(RecipeStep ing)
	{
		return this.name.compareTo(ing.name);
	}
}
