package com.cw4.creation.builder;

/* MonteurConcret */
public class MonteurPizzaPiquante extends MonteurPizza {
	public void monterPate() {
		pizza.setPate("feuilletée");
	}

	public void monterSauce() {
		pizza.setSauce("piquante");
	}

	public void monterGarniture() {
		pizza.setGarniture("pepperoni+salami");
	}
}