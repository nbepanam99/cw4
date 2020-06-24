package com.cw4.behavioral.visitorV1;

import com.cw4.behavioral.visitorV1.model.Body;
import com.cw4.behavioral.visitorV1.model.Car;
import com.cw4.behavioral.visitorV1.model.Engine;
import com.cw4.behavioral.visitorV1.model.Light;
import com.cw4.behavioral.visitorV1.model.Wheel;

public class CarElementDoVisitor implements CarElementVisitor {
    
	public void visit(Wheel wheel) {
        System.out.println("Kicking my "+ wheel.getName());
    }

    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }

    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    public void visitCar(Car car) {
        System.out.println("\nStarting my car");
        for(CarElement carElement : car.getElements()) {
            carElement.accept(this);
        }
        System.out.println("Started car");
    }

	public void visit(Light light) {
		System.out.println("Trun on the light");
	}


}
