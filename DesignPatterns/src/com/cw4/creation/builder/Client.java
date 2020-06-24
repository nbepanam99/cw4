package com.cw4.creation.builder;

public class Client {

	public static void main(String... args) {
		Serveur serveur_ou_directeur=new Serveur();
		MonteurPizza monteurPizzaHawaii = new MonteurPizzaHawaii();
		MonteurPizza monteurPizzaPiquant = new MonteurPizzaPiquante();

		serveur_ou_directeur.setMonteurPizza(monteurPizzaPiquant);
		serveur_ou_directeur.construirePizza();
		
		Pizza pizza = serveur_ou_directeur.getPizza();
		
		System.out.println("-- Pizza construite : " + pizza.toString());
	}

}
