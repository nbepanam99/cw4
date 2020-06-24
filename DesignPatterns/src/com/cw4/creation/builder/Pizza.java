package com.cw4.creation.builder;

/* Produit */
public class Pizza {
	private String pate = "";
	private String sauce = "";
	private String garniture = "";

	public void setPate(String pate) {
		this.pate = pate;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void setGarniture(String garniture) {
		this.garniture = garniture;
	}

	public String getPate() {
		return pate;
	}

	public String getSauce() {
		return sauce;
	}

	public String getGarniture() {
		return garniture;
	}

	@Override
	public String toString() {
		return "Pizza [pate=" + pate + ", sauce=" + sauce + ", garniture=" + garniture + "]";
	}
	
	
}
