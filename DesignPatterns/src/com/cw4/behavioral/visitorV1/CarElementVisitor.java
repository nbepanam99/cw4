package com.cw4.behavioral.visitorV1;

import com.cw4.behavioral.visitorV1.model.Body;
import com.cw4.behavioral.visitorV1.model.Car;
import com.cw4.behavioral.visitorV1.model.Engine;
import com.cw4.behavioral.visitorV1.model.Wheel;

public interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visitCar(Car car);
}
