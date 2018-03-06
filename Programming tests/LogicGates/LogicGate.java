package circuits;

public abstract class LogicGate implements Comparable<LogicGate>{

	protected LogicVariable output;
	protected LogicVariable[] input;
	protected String symbol;
	protected String formula;
	
	public LogicVariable getOutput()
	{
		return output;
	}
	
	public LogicVariable[] getInputs()
	{
		return input;
	}
	
	public String getSymbol()
	{
		return symbol;
	}

	public String getFormula() {
		return formula;
	}
	
	public abstract void updateOutput();
	
	public int compareTo(LogicGate l)
	{
		return symbol.compareTo(l.symbol);
	}
	
	public boolean findInput(LogicVariable lv)
	{
		for(LogicVariable v : input)
		{
			if(v.equals(lv))
				return true;
		}
		
		return false;
	}
}
