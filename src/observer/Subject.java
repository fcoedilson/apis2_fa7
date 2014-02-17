package observer;

public interface Subject {
	
	public void registrarDadosDoTempo(Observer dados);
	
	public void removerDadosDoTempo(Observer dados);
	
	public void notificarDadosDoTempo();

}
