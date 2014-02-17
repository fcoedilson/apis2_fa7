package strategy;

public class PatoDeMadeira extends Pato{
	
	public PatoDeMadeira(){
		modoDeGrasnar = new GrasnarMudo();
		
		modoDeVoar = new NaoVoa();
	}

}
