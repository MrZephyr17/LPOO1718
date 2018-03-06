package circuits;

public class GateNot extends LogicGate {

	public GateNot(LogicVariable y1, LogicVariable w2) throws ColisionException, CycleException {
		
		if(y1.getCalculatedBy()!=null)
			throw new ColisionException();
		
		if(w2.getCalculatedBy() != null && w2.getCalculatedBy().findInput(y1))
			throw new CycleException();
		
		output = y1;
		input = new LogicVariable[] {w2};
		symbol = "NOT";
		y1.setCalculatedBy(this);
		formula = symbol + "(" + w2.getFormula() + ")";
		y1.setFormula(formula);
		y1.setValue(!w2.value);
		w2.addInput(this);
	}

	@Override
	public void updateOutput() {
		output.setValue(!input[0].value);
		
	}
}
