package state;

public class ComMoeda implements Estado {
	
	ChicleMachine chicleMachine;
	
	public ComMoeda(ChicleMachine chicleMachine){
		this.chicleMachine = chicleMachine;
	}

	@Override
	public void inserirMoeda() {

		System.out.println("Impossível, Você já inseriu uma MOEDA");
	}

	@Override
	public void devolverMoeda() {

		System.out.println("MOEDA devolvida");
		this.chicleMachine.setEstadoAtual(chicleMachine.getSemMoeda());
	}

	@Override
	public void acionarAlavanca() {

		System.out.println("Você acionou a alavanca");
		this.chicleMachine.setEstadoAtual(chicleMachine.getChicleteVendido());
	}

	@Override
	public void entregarChiclete() {
		System.out.println("Você precisa acionar a alavanca");
	}

}
