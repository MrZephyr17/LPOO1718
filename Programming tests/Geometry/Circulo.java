package geometria;

public class Circulo extends Figura {

	private Ponto centro;
	private int raio; 
	
	public Circulo(Ponto p, int i) {
		
		if(i<=0)
			throw new IllegalArgumentException();
		
		centro = p;
		raio = i;
		area = Math.PI*raio*raio;
		perimetro = Math.PI*2*raio;
	}

	public int getRaio() {
		return raio;
	}

	public Ponto getCentro() {
		return centro;
	}

}
