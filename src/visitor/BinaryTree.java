package visitor;


public class BinaryTree implements Tree{

	Node root;
	int elementsNumber;
	
	// implementa método accept
	public void accept(Visitor visitor) {
		visitor.visit(root);
	}

	public BinaryTree(int first) {
		root = new Node(first);
		elementsNumber = 0;
	}

	public void inserir(int chave) {
		inserir(chave, root);
	}

	public void remover(int chave){
	}

	public void buscar(int chave){
	}

	private void inserir(int key, Node no) {

		if (no.getChave() == key)
			return;
		if (key > no.getChave()) {
			if (no.getDireito() == null) {
				no.setDireito(new Node(key));
				elementsNumber++;
				return;
			}
			inserir(key, no.getDireito());
		} else {
			if (no.getEsquerdo() == null) {
				no.setEsquerdo(new Node(key));
				elementsNumber++;
				return;
			}
			inserir(key, no.getEsquerdo());
		}
	}

	
}
