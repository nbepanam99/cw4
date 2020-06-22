package com.cw4.behavioral.visitorV1;

import com.cw4.behavioral.visitorV1.model.Car;

public class TestVisitorDemo {

	static public void main(String[] args) {
        Car car = new Car();

        CarElementVisitor printVisitor = new CarElementPrintVisitor();
        CarElementVisitor doVisitor = new CarElementDoVisitor();

        printVisitor.visitCar(car);
        doVisitor.visitCar(car);
    }

}
