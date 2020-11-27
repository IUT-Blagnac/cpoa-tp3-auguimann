package FabriquePizza;

import Fabrique.PizzaFabrique;
import Produit.PizzaCheeseStyleBrest;
import Produit.PizzaGrecqueStyleBrest;
import Produit.PizzaPoivronStyleBrest;
import ProduitAbtrait.Pizza;

public class FabriquePizzaBrest extends PizzaFabrique{

	private static FabriquePizzaBrest uniqueInstance;
	
	private FabriquePizzaBrest() {
		
	}
	
	public static FabriquePizzaBrest getInstance() {

		if(uniqueInstance == null) {

			uniqueInstance = new FabriquePizzaBrest();

		}

		return uniqueInstance;

	}
	
	public Pizza creerPizza(String name) {

		Pizza pizza = null;

		if(name.equals("Grecque")) {

			pizza = new PizzaGrecqueStyleBrest();

		}else if(name.equals("Poivron")) {

			pizza = new PizzaPoivronStyleBrest();

		}else if(name.equals("Fromage")) {

			pizza = new PizzaCheeseStyleBrest();

		}

		return pizza;
	}
}
