package FabriquePizza;

import Fabrique.PizzaFabrique;
import Produit.PizzaCheeseStyleStrasbourg;
import Produit.PizzaGrecqueStyleStrasbourg;
import Produit.PizzaPoivronStyleStrasbourg;
import ProduitAbtrait.Pizza;

public class FabriquePizzaStrasbourg extends PizzaFabrique{

	private static FabriquePizzaStrasbourg uniqueInstance;
	
	private FabriquePizzaStrasbourg() {}
	
	public static FabriquePizzaStrasbourg getInstance() {

		if(uniqueInstance == null) {

			uniqueInstance = new FabriquePizzaStrasbourg();

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
