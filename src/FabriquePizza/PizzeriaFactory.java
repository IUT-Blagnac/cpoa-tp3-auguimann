package FabriquePizza;

import Fabrique.PizzeriaBrest;
import Fabrique.PizzeriaStrasbourg;
import FabriqueAbstract.Pizzeria;

public class PizzeriaFactory {

	private static PizzeriaFactory uniqueInstance;
	
	private PizzeriaFactory() {
		
	}
	
	public static PizzeriaFactory getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new PizzeriaFactory();
		}
		return uniqueInstance;
	}
	
	public Pizzeria creerPizzeria(String name) {
		
		Pizzeria pizzeria = null;
		if(name.equals("Brest")) {
			pizzeria = new PizzeriaBrest();
		}else if(name.equals("Strasbourg")) {
			pizzeria = new PizzeriaStrasbourg();
		}
		
		return pizzeria;
	}
}
