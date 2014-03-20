package state;

public class SemMoeda implements Estado{


	ChicleMachine chicleMachine;
	
	public SemMoeda(ChicleMachine chicleMachine){
		this.chicleMachine = chicleMachine;
	}
	
	@Override
	public void inserirMoeda() {

		System.out.println("Você inseriu MOEDA"); 
		chicleMachine.setEstadoAtual(chicleMachine.getComMoeda()); // muda esta para COM MOEDA
	}

	@Override
	public void devolverMoeda() {

		System.out.println("Impossível, Você não inseriu MOEDA"); 
	}

	@Override
	public void acionarAlavanca() {

		System.out.println("Impossível, Você acionou alavança SEM MOEDA"); 
	}

	@Override
	public void entregarChiclete() {

		System.out.println("Impossível, Você precisa inserir uma MOEDA e acionar a alavanca");
	}


}
