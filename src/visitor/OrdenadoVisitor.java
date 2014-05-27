package visitor;

public class OrdenadoVisitor implements Visitor{
	
	@Override
	public void visit(Node no) {
		if (no == null)
			return;

		this.visit(no.getEsquerdo());		
		System.out.println(no);		
		this.visit(no.getDireito());
	}

}
