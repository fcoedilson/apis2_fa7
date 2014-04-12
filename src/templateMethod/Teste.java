package templateMethod;

public class Teste {

	public static void main(String[] args) {

		Treino inicioTemporada = new TreinoInicioTemporada();
		Treino meioTemporada = new TreinoMeioTemporada();

		inicioTemporada.treinoDiario();
		meioTemporada.treinoDiario();
		
	}

}
