package state;

public class SemChiclete implements Estado {

	ChicleMachine chicleMachine;
	
	public SemChiclete(ChicleMachine chicleMachine){
		this.chicleMachine = chicleMachine;
	}
	
	@Override
	public void inserirMoeda() {
		System.out.println("MOEDA não pode inserida, Máquina Sem chiclete!");
	}

	@Override
	public void devolverMoeda() {
		System.out.println("MOEDA não pode ser devolvida,  Máquina Sem chiclete!");
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("MOEDA não inserida, Máquina Sem chiclete!!");
	}

	@Override
	public void entregarChiclete() {
		System.out.println("Máquina Sem chiclete!");
	}

}
