package com.cw4.behavioral.visitorV1;

import com.cw4.behavioral.visitorV1.model.Body;
import com.cw4.behavioral.visitorV1.model.Car;
import com.cw4.behavioral.visitorV1.model.Engine;
import com.cw4.behavioral.visitorV1.model.Light;
import com.cw4.behavioral.visitorV1.model.Wheel;

public class CarElementPrintVisitor  implements CarElementVisitor {

	public void visit(Wheel wheel) {
        System.out.println("Visiting "+ wheel.getName() + " wheel");
    }

    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }

    public void visit(Body body) {
        System.out.println("Visiting body");
    }
	
    public void visit(Light light) {
		System.out.println("Visiting the lights");
		
	}
	
    public void visitCar(Car car) {
        System.out.println("\nVisiting car");
        for(CarElement element : car.getElements()) {
            element.accept(this);
        }
        System.out.println("Visited car");
    }


}
