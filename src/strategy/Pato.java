package strategy;

public class Pato {
	
	public ModoDeGrasnar modoDeGrasnar;
	
	public ModoDeVoar modoDeVoar;
	
	public void grasnar(){
		this.modoDeGrasnar.grasnar();
	}
	
	public void voar(){
		this.modoDeVoar.voar();
	}

}
