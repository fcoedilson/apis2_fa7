package decorator;

public class TravaEletrica extends AcessorioDecorator {

	public TravaEletrica(Veiculo veiculo){
		this.veiculo = veiculo;
	};
	
	@Override
	public float custo() {
		return 1500F + veiculo.custo();
	}

}
