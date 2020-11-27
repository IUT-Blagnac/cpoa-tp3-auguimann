package FabriquePizza;

import Fabrique.PizzaFactory;
import Produit.PizzaCheeseStyleBrest;
import Produit.PizzaGrecqueStyleBrest;
import Produit.PizzaPoivronStyleBrest;
import ProduitAbtrait.Pizza;

public class PizzaBrestFactory extends PizzaFactory {

	private static PizzaBrestFactory uniqueInstance;
	
	private PizzaBrestFactory() {
		
	}
	
	public static PizzaBrestFactory getInstance() {

		if(uniqueInstance == null) {

			uniqueInstance = new PizzaBrestFactory();

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
