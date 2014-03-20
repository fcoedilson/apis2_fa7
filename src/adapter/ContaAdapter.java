package adapter;

public class ContaAdapter implements Conta{
	
	private ContaPoupanca poupanca;
	
	public ContaAdapter(){
		this.poupanca = new ContaPoupanca();
	}

	@Override
	public Float saldo() {
		return poupanca.valorAcumulado();
	}
	

}
