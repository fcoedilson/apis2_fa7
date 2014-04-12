package command;

public class ControleRemoto {
	
	private Comando comando;
	private Comando comandoUndo;
	
	public ControleRemoto(){
		
	}


	public void setComando(Comando comando) {
		this.comando = comando;
		this.comandoUndo = this.comando;
	}
	
	public void PressionarBotao(){
		this.comando.executar();
	    
	}
	
	public void PressionarUndo(){
		this.comandoUndo.undo();
	}

}
