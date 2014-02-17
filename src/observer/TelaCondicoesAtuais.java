package observer;

public class TelaCondicoesAtuais implements Observer, Exibir{
	
	float temperatura;
	float umidade;
	
	Subject dadasDoTempo;

	@Override
	public void exibirElemento() {
		
		System.out.println("\n======== TELA CONDI��ES ATUAIS =========");
		
		System.out.println("Condi��es atuais: "+ temperatura +"�C e "+ umidade	+"% de umidade");
		
	}

	@Override
	public void atualizar(float temperatura, float umidade, float pressao) {
		this.temperatura= temperatura;
		this.umidade= umidade;
		exibirElemento();
	}
	
	public TelaCondicoesAtuais(Subject dadosDoTempo){
		
		this.dadasDoTempo = dadosDoTempo;
		this.dadasDoTempo.registrarDadosDoTempo(this);
	}
	


}
