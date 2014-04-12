package templateMethod;

public class TreinoInicioTemporada extends Treino {

	@Override
	public void treinoTatico() {
		System.out.println("treino tático inicio temporada");
	}

	@Override
	public void preparoFisico() {
		System.out.println("preparo físico início temporada");
	}

}
