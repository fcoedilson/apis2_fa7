package factory;

public abstract class Pizzaria {


	public final Pizza pedirPizza(String sabor) {
		Pizza pizza;
		pizza = criarPizza(sabor);
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
		return pizza;
	}
	
	
	public abstract  Pizza criarPizza(String sabor);

}
