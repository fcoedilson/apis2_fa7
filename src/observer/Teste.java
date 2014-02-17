package observer;

public class Teste {

	public static void main(String[] args) {

		DadosDoTempo dadosDoTempo = new DadosDoTempo();
		
		TelaCondicoesAtuais telaCondicoesAtuais = new TelaCondicoesAtuais(dadosDoTempo);
		dadosDoTempo.setMedicoes(20, 70, 50);
		//telaCondicoesAtuais.exibirElemento();
	}

}
