package visitor;

public class Node {
  
	private int key;
    Node esquerdo, direito;
 
    public Node(int key) {
        this.key = key;
        esquerdo = null;
        direito = null;
    }
 
    public String toString() {
        return String.valueOf(key);
    }
 
    public int getChave() {
        return key;
    }
 
    public Node getEsquerdo() {
        return esquerdo;
    }
 
    public void setEsquerdo(Node esquerdo) {
        this.esquerdo = esquerdo;
    }
 
    public Node getDireito() {
        return direito;
    }
 
    public void setDireito(Node direito) {
        this.direito = direito;
    }
 
}
