package templateMethod;

public class TreinoInicioTemporada extends Treino {

	@Override
	public void treinoTatico() {
		System.out.println("treino t�tico inicio temporada");
	}

	@Override
	public void preparoFisico() {
		System.out.println("preparo f�sico in�cio temporada");
	}

}
