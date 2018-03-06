package circuits;

import java.util.TreeSet;

public class CombinatorialCircuit {

	private TreeSet<LogicVariable> variables;
	
	public CombinatorialCircuit()
	{
		variables =new TreeSet<LogicVariable>();
	}
	
	public boolean addVariable(LogicVariable a) {
		return variables.add(a);
	}

	public LogicVariable getVariableByName(String string) {
		
		for(LogicVariable variable :variables)
			if(variable.getName().equals(string))
				return variable;
		
		return null;
	}

}
