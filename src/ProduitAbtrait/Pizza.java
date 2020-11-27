package ProduitAbtrait;

import java.util.ArrayList;

@SuppressWarnings("unused")
public abstract class Pizza {
	private String nom;
	private String pate;
	private String sauce;
	private ArrayList <String> garnitures = new ArrayList<>();
	 
	public void preparer() {
		System.out.println("Préparation de " + nom);
		System.out.println("Étalage de la pâte...");
		System.out.println("Ajout de la sauce...");
		System.out.println("Ajout des garnitures: ");
		for (int i = 0; i < garnitures.size(); i++) {
			System.out.println(" " + garnitures.get(i));
		}
	}
	 
	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}
	 
	public void couper() {
		System.out.println("Découpage en parts triangulaires");
	}
	 
	public void emballer() {
		System.out.println("Emballage dans une boîte officielle");
	}
	 
	public String getNom() {
		return nom;
	}
}
