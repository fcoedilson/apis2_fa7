package state;

public class ChicleMachine {

	Estado comMoeda; 
	Estado semMoeda; 
	Estado semChiclete; 
	Estado chicleteVendido; 
	int numChicletes = 0; 

	Estado estadoAtual = semChiclete;


	public ChicleMachine(int numChicletes) { 
		semMoeda = new SemMoeda(this); 
		comMoeda = new ComMoeda(this); 
		semChiclete = new SemChiclete(this); 
		chicleteVendido = new ChicleteVendido(this); 

		this.numChicletes = numChicletes; 
		if (numChicletes > 0) 
			estadoAtual = semMoeda; 
		else 
			estadoAtual = semChiclete;
	}


	public void inserirMoeda() { 
		estadoAtual.inserirMoeda(); 
	} 

	public void devolverMoeda() { 
		estadoAtual.devolverMoeda(); 
	} 

	public void acionarAlavanca() { 
		estadoAtual.acionarAlavanca(); 
		estadoAtual.entregarChiclete(); 
	} 

	public void entregarChiclete() { 
		if (numChicletes > 0) 
			numChicletes = numChicletes -1; 
	}


	public Estado getComMoeda() {
		return comMoeda;
	}

	public void setComMoeda(Estado comMoeda) {
		this.comMoeda = comMoeda;
	}

	public Estado getSemMoeda() {
		return semMoeda;
	}

	public void setSemMoeda(Estado semMoeda) {
		this.semMoeda = semMoeda;
	}

	public Estado getSemChiclete() {
		return semChiclete;
	}

	public void setSemChiclete(Estado semChiclete) {
		this.semChiclete = semChiclete;
	}

	public Estado getChicleteVendido() {
		return chicleteVendido;
	}

	public void setChicleteVendido(Estado chicleteVendido) {
		this.chicleteVendido = chicleteVendido;
	}

	public int getNumChicletes() {
		return numChicletes;
	}

	public void setNumChicletes(int numChicletes) {
		this.numChicletes = numChicletes;
	}

	public Estado getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(Estado estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

}
