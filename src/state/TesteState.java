package state;

public class TesteState {

	public static void main(String[] args) {

		ChicleMachine m = new ChicleMachine(1);
		m.inserirMoeda();
		m.acionarAlavanca();
		m.entregarChiclete();
		
		m.inserirMoeda();
		m.devolverMoeda();
		m.inserirMoeda();
		m.acionarAlavanca();
		m.entregarChiclete();
		
		m.inserirMoeda();
		m.acionarAlavanca();
		m.entregarChiclete();
	}

}
