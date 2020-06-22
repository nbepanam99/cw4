package com.cw4.behavioral.visitorV1.model;

import com.cw4.behavioral.visitorV1.CarElement;
import com.cw4.behavioral.visitorV1.CarElementVisitor;

public class Wheel implements CarElement {

    private String name;

    Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}


	@Override
	public String toString() {
		return "Wheel{}";
	}


}
