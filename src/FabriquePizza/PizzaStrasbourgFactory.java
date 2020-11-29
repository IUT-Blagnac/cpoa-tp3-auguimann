package FabriquePizza;

import Fabrique.PizzaFactory;
import Produit.PizzaCheeseStyleStrasbourg;
import Produit.PizzaGrecqueStyleStrasbourg;
import Produit.PizzaPoivronStyleStrasbourg;
import ProduitAbtrait.Pizza;

public class PizzaStrasbourgFactory extends PizzaFactory {

	private static PizzaStrasbourgFactory uniqueInstance;
	
	private PizzaStrasbourgFactory() {}
	
	public static PizzaStrasbourgFactory getInstance() {

		if(uniqueInstance == null) {

			uniqueInstance = new PizzaStrasbourgFactory();

		}

		return uniqueInstance;

	}
	
	public Pizza creerPizza(String name) {

		Pizza pizza = null;

		if(name.equals("Grecque")) {

			pizza = new PizzaGrecqueStyleStrasbourg();

		}else if(name.equals("Poivron")) {

			pizza = new PizzaPoivronStyleStrasbourg();

		}else if(name.equals("Fromage")) {

			pizza = new PizzaCheeseStyleStrasbourg();

		}

		return pizza;
	}
}
