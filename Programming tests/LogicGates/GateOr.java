package circuits;

public class GateOr extends LogicGate {

	public GateOr(LogicVariable w2, LogicVariable w1, LogicVariable x3) throws ColisionException, CycleException {
		
		if(w2.getCalculatedBy()!=null)
			throw new ColisionException();
		
		if((w1.getCalculatedBy() != null && w1.getCalculatedBy().findInput(w2)) || (x3.getCalculatedBy()!=null && x3.getCalculatedBy().findInput(w2)))
			throw new CycleException();
		
		output = w2;
		input = new LogicVariable[] {w1,x3};
		symbol = "OR";
		w2.setCalculatedBy(this);
		formula = symbol + "(" + w1.getFormula() + "," + x3.getFormula() + ")";
		w2.setFormula(formula);
		w2.setValue(w1.value || x3.value);
		w1.addInput(this);
		x3.addInput(this);
	}
	
	
	@Override
	public void updateOutput() {
		output.setValue(input[0].value || input[1].value);
		
	}
}
