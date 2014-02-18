package decorator;

public class ArCondicionado extends AcessorioDecorator {

	public ArCondicionado(Veiculo veiculo){
		this.veiculo = veiculo;
	};
	
	@Override
	public float custo() {
		return 2000F + veiculo.custo();
	}

}
