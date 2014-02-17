package strategy;

public class PatoDeBorracha extends Pato {
	
	public PatoDeBorracha() {
		
		modoDeGrasnar = new GrasnarMudo();
		modoDeVoar = new VoaComPropulsor();
		
	}

}
