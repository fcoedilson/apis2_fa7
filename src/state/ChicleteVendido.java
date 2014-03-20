package state;

public class ChicleteVendido implements Estado{
	
	ChicleMachine chicleMachine;
	
	public ChicleteVendido(ChicleMachine chicleMachine){
		this.chicleMachine = chicleMachine;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Aguarde a entrega do chiclete");
	}

	@Override
	public void devolverMoeda() {
		System.out.println("Aguarde finalizar entrega!");
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("Alavanca já acionada, aguarde entrega");
	}

	@Override
	public void entregarChiclete() {
		System.out.println("Chiclete entregue!! \n \\\\");
		this.chicleMachine.setEstadoAtual(this.chicleMachine.getSemMoeda());
	}

}
