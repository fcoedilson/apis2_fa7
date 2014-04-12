package iterator;

import java.util.ArrayList;

public class Cliente {

	public static void main(String[] args) {

		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item("cafe", 1.0F, "Caf� comum"));
		list.add(new Item("leite", 3.0F, "leite comum"));
		list.add(new Item("caf� com leite", 4.0F, "Caf� e leite comum"));
		list.add(new Item("cappuccino", 10.0F, "Caf� cappuccino"));
		

		MenuIterator menu = new MenuIteratorPanquecaria(list);
		Iterator iterator = menu.criarIterator();
		
		// imprimir
		
		while(iterator.hasNext()){
			
			Item item = (Item)iterator.next();
			System.out.println("NOME:" + item.getNome() + "  PRE�O:" + item.getPreco() + "  DESC:" + item.getDescricao());
		}
		
	}

}
