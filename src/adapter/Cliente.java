package adapter;

public class Cliente {
	
	
	public static void main(String[] args){
		
		Conta especial = new ContaEspecial();
		System.out.println("saldo conta especial: " + especial.saldo());
		
		Conta cc = new ContaCorrente();
		System.out.println("saldo conta corrente: " + cc.saldo());
		
		Conta poupanca = new ContaAdapter();
		System.out.println("poupança: " + poupanca.saldo());
	}

}
