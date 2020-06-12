package com.cw4.creation.factory;

public class ProduitFactory2 extends ProduitFactory {

	@Override
	protected ProduitA createProduitA() {
		return new ProduitA2();
	}

}
