package decorator;

public class DirecaoHidraulica extends AcessorioDecorator {

	public DirecaoHidraulica(Veiculo veiculo){
		
		this.veiculo = veiculo;
	}
	
	@Override
	public float custo() {
		return 2500F + veiculo.custo();
	}

}
