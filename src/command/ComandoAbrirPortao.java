package command;

public class ComandoAbrirPortao implements Comando {
	
	private Portao portao = null;
	
	public ComandoAbrirPortao(Portao portao){
		this.portao = portao;
	}

	@Override
	public void executar() {
		this.portao.abrirPortao();
	}

	@Override
	public void undo() {
		this.portao.fecharPortao();
	}

}
