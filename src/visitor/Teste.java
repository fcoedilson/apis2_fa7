package visitor;

public class Teste {
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(3);

		//tree.inserir(15);
		//tree.inserir(10);
		//tree.inserir(5);
		//tree.inserir(2);
		//tree.inserir(1);
		//tree.inserir(20);
		
		tree.inserir(5);
		tree.inserir(2);
		tree.inserir(10);

		System.out.println("### Ordenado:");
		tree.accept(new OrdenadoVisitor());
		
		System.out.println("### Pré ordem:");
		tree.accept(new PreOrdenadoVisitor());
		
		System.out.println("### pós ordem:");
		tree.accept(new PosOrdenadoVisitor());
		
		System.out.println("### Identado:");
		tree.accept(new IdentadoVisitor());
	}

}
