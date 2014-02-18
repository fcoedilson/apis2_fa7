package decorator;

public class CompraVeiculo {

	public static void main(String[] args) {

		Veiculo v = new Palio();
		v = new ArCondicionado(v);
		v = new TravaEletrica(v);
		v = new DirecaoHidraulica(v);
		
		System.out.println("O valor do seu veículo é " + v.custo());
	}

}
