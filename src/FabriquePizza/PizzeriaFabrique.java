package FabriquePizza;

import Fabrique.PizzeriaBrest;
import Fabrique.PizzeriaStrasbourg;
import FabriqueAbstract.Pizzeria;

public class PizzeriaFabrique {

	private static PizzeriaFabrique uniqueInstance;
	
	private PizzeriaFabrique() {
		
	}
	
	public static PizzeriaFabrique getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new PizzeriaFabrique();
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
