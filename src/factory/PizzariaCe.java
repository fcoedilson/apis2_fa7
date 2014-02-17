package factory;

public class PizzariaCe extends Pizzaria{


	@Override
	public Pizza criarPizza(String sabor) {
		
		PizzaCalabrezaCe pizza = null;
		if(sabor == "calabreza"){
			pizza = new PizzaCalabrezaCe();
		}
		
		return null;
	}
}
