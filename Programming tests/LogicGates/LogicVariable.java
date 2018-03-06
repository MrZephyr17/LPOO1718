package circuits;
import java.util.TreeSet;

public class LogicVariable implements Comparable<LogicVariable>{

	protected String name;
	protected boolean value;
	protected LogicGate calculatedBy;
	protected TreeSet<LogicGate> input;
	protected String formula;

	public LogicVariable(String string, boolean b) {
		name = string;
		value = b;
		formula = name;
		input = new TreeSet<LogicGate>();
	}

	public void addInput(LogicGate g)
	{
		input.add(g);
	}

	public LogicVariable(String string) {
		name = string;
		value = false;
		input = new TreeSet<LogicGate>();
	}

	public Object getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(boolean b) {
		value = b;

		for(LogicGate gate : input)
		{
			gate.updateOutput();
		}

	}

	public boolean equals(Object b)
	{
		return b!=null && b instanceof LogicVariable && name == ((LogicVariable) b).name;
	}

	public LogicGate getCalculatedBy() 
	{
		return calculatedBy;
	}

	public void setCalculatedBy(LogicGate l)
	{
		calculatedBy = l;
	}

	public String getFormula() 
	{
		return formula;
	}

	public void setFormula(String f)
	{
		formula = f;
	}

	@Override
	public int compareTo(LogicVariable o) {
		return name.compareTo(o.name);
	}

}
