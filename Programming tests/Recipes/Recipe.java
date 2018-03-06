package recipes;

import java.util.TreeSet;

public class Recipe {

	private String name;
	private TreeSet<RecipeStep> steps;

	public Recipe(String string) {
		name = string;
		steps = new TreeSet<RecipeStep>();
	}

	public int getStepCount() {
		return steps.size(); 
	}

	public void addStep(RecipeStep step) {
		steps.add(step);
	}

}
