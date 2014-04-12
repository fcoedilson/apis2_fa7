package templateMethod;

public class TreinoMeioTemporada extends Treino {

	@Override
	public void preparoFisico() {
		System.out.println("preparo fisico meio temporada");
	}

	@Override
	public void treinoTatico() {
		System.out.println("treino tático meio temporada");
	}

}
