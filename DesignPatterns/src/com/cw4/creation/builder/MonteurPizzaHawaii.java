package com.cw4.creation.builder;

/* MonteurConcret */
public class MonteurPizzaHawaii extends MonteurPizza {

	public void monterPate() {
		pizza.setPate("croisée");
	}

	public void monterSauce() {
		pizza.setSauce("douce");
	}

	public void monterGarniture() {
		pizza.setGarniture("jambon+ananas");
	}

}
