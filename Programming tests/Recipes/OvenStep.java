package recipes;

public class OvenStep extends RecipeStep {
	
	private int temperature;
	
	public OvenStep(String n, String a, int temp)
	{
		super(n,a);
		temperature = temp;
	}
	
	public int getTemperature()
	{
		return temperature;
	}

}
