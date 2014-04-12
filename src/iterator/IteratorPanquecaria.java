package iterator;

import java.util.ArrayList;

public class IteratorPanquecaria implements Iterator{

	ArrayList<Item> itens = null;
	int position = 0;
	
	public IteratorPanquecaria(ArrayList<Item> itens){
		this.itens = itens;
	}
	
	
	@Override
	public Object next() {
		
		Object item = itens.get(position);
		position++;
		return item;
	}

	@Override
	public boolean hasNext() {
		
		if( position >= itens.size() || itens.get(position) == null ){
			return false;
		} else {
			return true;
		}
	}

}
