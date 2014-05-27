package visitor;

public class PosOrdenadoVisitor implements Visitor {
	
	@Override
	public void visit(Node no) {
		if (no == null)
			return;
		visit(no.getEsquerdo());
		visit(no.getDireito());
		System.out.println(no);
	}

}
