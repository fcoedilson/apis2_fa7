package iterator;

import java.util.ArrayList;

public class Cliente {

	public static void main(String[] args) {

		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item("cafe", 1.0F, "Café comum"));
		list.add(new Item("leite", 3.0F, "leite comum"));
		list.add(new Item("café com leite", 4.0F, "Café e leite comum"));
		list.add(new Item("cappuccino", 10.0F, "Café cappuccino"));
		

		MenuIterator menu = new MenuIteratorPanquecaria(list);
		Iterator iterator = menu.criarIterator();
		
		// imprimir
		
		while(iterator.hasNext()){
			
			Item item = (Item)iterator.next();
			System.out.println("NOME:" + item.getNome() + "  PREÇO:" + item.getPreco() + "  DESC:" + item.getDescricao());
		}
		
	}

}
