
public class TGV extends Comboio {

	public TGV(String string) {
		super(string);	
		servico = new ServicoPrioritario();

	}

	public String toString()
	{
		String res = "TGV " + name + ", "; 

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
}
