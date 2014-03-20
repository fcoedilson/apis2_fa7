package state;

public class ComMoeda implements Estado {
	
	ChicleMachine chicleMachine;
	
	public ComMoeda(ChicleMachine chicleMachine){
		this.chicleMachine = chicleMachine;
	}

	@Override
	public void inserirMoeda() {

		System.out.println("Imposs�vel, Voc� j� inseriu uma MOEDA");
	}

	@Override
	public void devolverMoeda() {

		System.out.println("MOEDA devolvida");
		this.chicleMachine.setEstadoAtual(chicleMachine.getSemMoeda());
	}

	@Override
	public void acionarAlavanca() {

		System.out.println("Voc� acionou a alavanca");
		this.chicleMachine.setEstadoAtual(chicleMachine.getChicleteVendido());
	}

	@Override
	public void entregarChiclete() {
		System.out.println("Voc� precisa acionar a alavanca");
	}

}
