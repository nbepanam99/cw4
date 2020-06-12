package com.cw4.creation.abstract_factory;

public class ProduitFactory2 implements IProduitFactory {

	@Override
	public ProduitA getProduitA() {
		return new ProduitA2();
	}

	@Override
	public ProduitB getProduitB() {
		return new ProduitB2();
	}

}
