package com.cw4.creation.abstract_factory;

public class ProduitFactory1 implements IProduitFactory {

	@Override
	public ProduitA getProduitA() {
		return new ProduitA1();
	}

	@Override
	public ProduitB getProduitB() {
		return new ProduitB1();
	}

}
