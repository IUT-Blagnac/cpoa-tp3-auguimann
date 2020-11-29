package FabriqueAbstract;
import ProduitAbtrait.Pizza;


public abstract class Pizzeria {
	
	 public final Pizza commanderPizza(String type) {
		 Pizza pizza;
		 pizza = creerPizza(type);
		 pizza.preparer();
		 pizza.cuire();
		 pizza.couper();
		 pizza.emballer();
		 return pizza;
	 }
	 
	 protected Pizza creerPizza(String name) {
		 Pizza pizza = null;
		 
		 return pizza;
	 }
}
