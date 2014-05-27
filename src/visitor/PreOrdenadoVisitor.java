package visitor;

public class PreOrdenadoVisitor implements Visitor {


	@Override
	public void visit(Node no) {
		if (no == null)
			return;
		System.out.println(no);
		visit(no.getEsquerdo());
		visit(no.getDireito());
	}

}
