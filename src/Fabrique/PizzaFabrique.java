package Fabrique;
import ProduitAbtrait.Pizza;
import Produit.PizzaCheeseStyleBrest;
import Produit.PizzaPoivronStyleBrest;
import Produit.PizzaGrecqueStyleBrest;

public abstract class PizzaFabrique {
	public Pizza creerPizza(String type) {

		Pizza pizza = null;

		if (type.equals("fromage")) {

		  pizza = new PizzaCheeseStyleBrest();

		} else if (type.equals("Poivron")) {

		  pizza = new PizzaPoivronStyleBrest();

		} else if (type.equals("Grecque")) {

		  pizza = new PizzaGrecqueStyleBrest();

		}

		return pizza;

	}

}
