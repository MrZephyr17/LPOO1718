package geometria;

public class Ponto implements Comparable<Ponto>{

	private int x;
	private int y;
	
	public Ponto(int i, int j) {		
		x = i;
		y = j;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
	public boolean equals(Object p2)
	{
		return p2!=null && p2 instanceof Ponto && x==((Ponto) p2).x && y==((Ponto) p2).y;
	}
		
	public int compareTo(Ponto p2)
	{
		if(x<p2.x)
			return -1;
		
		if(x>p2.x)
			return 1;
		
		if(y<p2.y)
			return -1;
		
		if(y>p2.y)
			return 1;
		
		return 0;
	}

}
