package state;

public class SemChiclete implements Estado {

	ChicleMachine chicleMachine;
	
	public SemChiclete(ChicleMachine chicleMachine){
		this.chicleMachine = chicleMachine;
	}
	
	@Override
	public void inserirMoeda() {
		System.out.println("MOEDA n�o pode inserida, M�quina Sem chiclete!");
	}

	@Override
	public void devolverMoeda() {
		System.out.println("MOEDA n�o pode ser devolvida,  M�quina Sem chiclete!");
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("MOEDA n�o inserida, M�quina Sem chiclete!!");
	}

	@Override
	public void entregarChiclete() {
		System.out.println("M�quina Sem chiclete!");
	}

}
