package com.cw4.behavioral.visitorV1.model;

import com.cw4.behavioral.visitorV1.CarElement;
import com.cw4.behavioral.visitorV1.CarElementVisitor;

public class Body implements CarElement {
	
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Body{}";
	}
}
