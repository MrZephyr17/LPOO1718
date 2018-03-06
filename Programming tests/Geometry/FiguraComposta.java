package geometria;

public class FiguraComposta extends Figura {

	private Figura[] figuras;
	
	public FiguraComposta(Figura[] figuras) {
		this.figuras=figuras;
		
		area = 0;
		for(Figura figura: figuras)
		{
			area+=figura.getArea();
		}
	}

	@Override
	public int count() {
		return figuras.length;
	}

}
