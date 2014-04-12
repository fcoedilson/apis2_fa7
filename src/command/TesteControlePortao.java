package command;

public class TesteControlePortao {
	
	
	public static void main(String[] args){
		
		ControleRemoto controle = new ControleRemoto();
		Portao  p = new Portao();
		
		ComandoAbrirPortao abrirPortao = new ComandoAbrirPortao(p);
		controle.setComando(abrirPortao);
		
		controle.PressionarBotao();
		controle.PressionarUndo();
	}

}
