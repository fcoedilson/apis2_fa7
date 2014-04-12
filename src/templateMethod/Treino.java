package templateMethod;

public abstract class Treino {
	
	
	public final void treinoDiario(){
		
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	public abstract void preparoFisico();
	public abstract  void treinoTatico();
	
	public final void jogoTreino(){
		
		System.out.println("jogo treino");
	}

}
