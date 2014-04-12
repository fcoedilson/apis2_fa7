package iterator;

public class Item {
	
	private String nome;
	private float preco;
	private String descricao;

	public Item(String nome, Float preco, String descricao){
		
		this.nome = nome; 
		this.preco = preco; 
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
