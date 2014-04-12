package iterator;

import java.util.ArrayList;

public class MenuIteratorPanquecaria implements MenuIterator{
	
	ArrayList<Item> itensMenu = null;
	
	public MenuIteratorPanquecaria(ArrayList<Item> itens){
		this.itensMenu = itens;
	}

	@Override
	public Iterator criarIterator() {
		return new IteratorPanquecaria(itensMenu);
	}
	

}
