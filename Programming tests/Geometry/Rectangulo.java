package geometria;

public class Rectangulo extends Figura {
	
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	
	public Rectangulo(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		perimetro = 2*Math.abs(x2-x1) + 2*Math.abs(y2-y1);
		area = Math.abs(x2-x1)*Math.abs(y2-y1);
	}

}
