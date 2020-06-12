package com.cw4.creation.factory;

public class ProduitFactory1 extends ProduitFactory {

	@Override
	protected ProduitA createProduitA() {
		return new ProduitA1();
	}

}
