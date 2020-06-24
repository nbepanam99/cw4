package com.cw4.behavioral.visitorV1.model;

import com.cw4.behavioral.visitorV1.CarElement;
import com.cw4.behavioral.visitorV1.CarElementVisitor;

public class Light implements CarElement  {

	public Light() {
		// TODO Auto-generated constructor stub
	}


	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
		
	}

}
