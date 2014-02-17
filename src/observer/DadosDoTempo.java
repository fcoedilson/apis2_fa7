package observer;

import java.util.ArrayList;

public class DadosDoTempo implements Subject{
	
	ArrayList<Observer> observers;
	
	float temperatura;
	float umidade;
	float pressao;
	
	
    public DadosDoTempo(){
    	
    	observers = new ArrayList<Observer>();
    }


	@Override
	public void registrarDadosDoTempo(Observer o) {

		observers.add(o);
	}


	@Override
	public void removerDadosDoTempo(Observer o) {

		int i = observers.indexOf(o);
		observers.remove(i);
	}


	@Override
	public void notificarDadosDoTempo() {
		for (Observer o : observers) {
			
			o.atualizar(temperatura, umidade, pressao);
		}
		
	}
	
	public void medicoesAlteradas(){
		notificarDadosDoTempo();
	}
	
	public void setMedicoes(float temperatura, float umidade, float pressao) {
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao  = pressao;
		medicoesAlteradas();
	}

}
