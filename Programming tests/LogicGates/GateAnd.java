package circuits;

public class GateAnd extends LogicGate {

	public GateAnd(LogicVariable w1, LogicVariable x1, LogicVariable x2) throws ColisionException, CycleException {
		
		if(w1.getCalculatedBy()!=null)
			throw new ColisionException();
		
		if((x1.getCalculatedBy() != null && x1.getCalculatedBy().findInput(w1)) ||  (x2.getCalculatedBy() != null && x2.getCalculatedBy().findInput(w1)))
			throw new CycleException();
		
		output = w1;
		input = new LogicVariable[] {x1,x2};
		symbol = "AND";
		w1.setCalculatedBy(this);
		formula = symbol + "(" + x1.getFormula() + "," + x2.getFormula() + ")";
		w1.setFormula(formula);
		w1.setValue(w1.value && x2.value);
		x1.addInput(this);
		x2.addInput(this);
	}

	@Override
	public void updateOutput() {
		output.setValue(input[0].value && input[1].value);
	}
}
