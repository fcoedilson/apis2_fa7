package strategy;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato p = new PatoDeBorracha();
		
		p.grasnar();
		p.voar();
		
		Pato m = new PatoDeMadeira();
		m.grasnar();
		m.voar();
	}

}
