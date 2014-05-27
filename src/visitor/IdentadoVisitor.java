package visitor;

public class IdentadoVisitor implements Visitor {
	
	@Override
	public void visit(Node no) {
		if (no == null) {
			return;
		}
		System.out.println(no);
		visit(no.getEsquerdo(), 1);
		visit(no.getDireito(), 1);
	}

	
	// identa elementos da arvore
	private void visit(Node no, int spacesNumber) {
		if (no == null) {
			return;
		}
		for (int i = 0; i < spacesNumber; i++) {
			System.out.print("-");
		}
		System.out.println(no);
		visit(no.getEsquerdo(), spacesNumber + 1);
		visit(no.getDireito(), spacesNumber + 1);
	}

}
