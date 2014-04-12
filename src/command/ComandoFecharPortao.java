package command;

public class ComandoFecharPortao implements Comando {
	
	private Portao portao = null;
	
	public ComandoFecharPortao(Portao portao){
		this.portao = portao;
	}

	@Override
	public void executar() {
		portao.fecharPortao();
	}

	@Override
	public void undo() {
		portao.abrirPortao();
	}
	
}
