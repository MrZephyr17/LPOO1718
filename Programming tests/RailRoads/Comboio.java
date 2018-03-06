import java.util.ArrayList;
import java.util.function.Predicate;

public class Comboio {

	protected String name;
	protected ArrayList<Carruagem> carruagens;
	protected ServicoABordo servico;

	public Comboio(String name) {
		this.name = name;
		carruagens = new ArrayList<Carruagem>();
		servico = new ServicoRegular();
	}

	public String getNome() {
		return name;
	}

	public int getNumLugares() {

		int sum = 0;

		for(Carruagem carruagem : carruagens)
		{
			sum+=carruagem.getNumLugares();
		}

		return sum;
	}

	public int getNumCarruagens() {
		return carruagens.size();
	}

	public void addCarruagem(Carruagem a1) {
		carruagens.add(a1);

	}

	public Carruagem getCarruagemByOrder(int i) {
		return carruagens.get(i);
	}

	public void removeAllCarruagens(int i) {

		Predicate<Carruagem> p = (x) -> x.getNumLugares() <= i;

		carruagens.removeIf(p);

	}

	public int getNumPassageiros() {
		int sum = 0;

		for(Carruagem carruagem :carruagens)
			sum+=carruagem.getNumPassageiros();

		return sum;
	}

	public int getLugaresLivres() {

		int sum = 0;

		for(Carruagem carruagem :carruagens)
			sum+=carruagem.getNumLugares()-carruagem.getNumPassageiros();

		return sum;
	}

	public void addPassageiros(int i) throws PassengerCapacityExceeded {

		if(i>getLugaresLivres())
			throw new PassengerCapacityExceeded();

		int n=i;
		for(Carruagem carruagem : carruagens)
		{
			n = carruagem.addPassageiros(n);

			if(n==0)
				return;
		}
	}

	public void removePassageiros(int i) {

		int n=i;
		for(Carruagem carruagem : carruagens)
		{
			n = carruagem.removePassageiros(n);

			if(n==0)
				return;
		}

	}

	public void removePassageiros() {
		for(Carruagem carruagem : carruagens)
		{
			carruagem.removePassageiros();
		}
	}

	public ServicoABordo getServicoABordo() {
		return servico;
	}

	public Object getDescricaoServico() {
		return servico.getDescricao();
	}

	public void setServicoABordo(ServicoPrioritario novoSer) {
		servico = novoSer;

	}

	public String toString()
	{
		String res = "Comboio " + name + ", "; 

		int size = carruagens.size();
		res+=size;
		if(size==1)
			res+= " carruagem, ";
		else
			res+= " carruagens, ";

		int lug = getNumLugares();
		res+=lug;

		if(lug==1)
			res+= " lugar, ";
		else
			res+= " lugares, ";

		int pass = getNumPassageiros();
		res+=pass;

		if(pass==1)
			res+=  " passageiro";
		else
			res+=  " passageiros";

		return res;
	}

	public boolean equals(Object c2)
	{
		if(c2!=null && c2 instanceof Comboio && carruagens.size() == ((Comboio) c2).carruagens.size())
		{
			for(int i =0;i<carruagens.size();i++)
			{
				if(carruagens.get(i).getNumLugares()!=((Comboio)c2).carruagens.get(i).getNumLugares())
					return false;
			}
			
			return true;
		}
		
		return false;
	}

}
