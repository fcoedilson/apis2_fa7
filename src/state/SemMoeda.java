package state;

public class SemMoeda implements Estado{


	ChicleMachine chicleMachine;
	
	public SemMoeda(ChicleMachine chicleMachine){
		this.chicleMachine = chicleMachine;
	}
	
	@Override
	public void inserirMoeda() {

		System.out.println("Voc� inseriu MOEDA"); 
		chicleMachine.setEstadoAtual(chicleMachine.getComMoeda()); // muda esta para COM MOEDA
	}

	@Override
	public void devolverMoeda() {

		System.out.println("Imposs�vel, Voc� n�o inseriu MOEDA"); 
	}

	@Override
	public void acionarAlavanca() {

		System.out.println("Imposs�vel, Voc� acionou alavan�a SEM MOEDA"); 
	}

	@Override
	public void entregarChiclete() {

		System.out.println("Imposs�vel, Voc� precisa inserir uma MOEDA e acionar a alavanca");
	}


}
