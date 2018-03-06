
public class Carruagem {

	private int lugares;
	private int passageiros;
	
	public Carruagem()
	{
		lugares = 40;
	}
	
	public Carruagem(int number) {
		lugares = number;
	}

	public int getNumLugares() {
		return lugares;
	}
	
	public int addPassageiros(int n)
	{
		if(passageiros + n <= lugares)
		{
			passageiros+=n;
			return 0;
		}
		
		int temp = lugares - passageiros;
		passageiros=lugares;
		return n - temp;
	}

	public int getNumPassageiros() {
		return passageiros;
	}
	
	public void removePassageiros()
	{
		passageiros = 0;
	}
	
	public int removePassageiros(int n)
	{
		if(passageiros - n >= 0)
		{
			passageiros-=n;
			return 0;
		}
		
		passageiros=0;
		return n - lugares;
	}
	

}
