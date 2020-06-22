package com.cw4.behavioral.visitorV1.model;

import com.cw4.behavioral.visitorV1.CarElement;

public class Car {
	CarElement[] elements;

    public CarElement[] getElements() {
        return elements.clone(); // Retourne une copie du tableau de références
    }

    public Car() {
        this.elements = new CarElement[] {
                new Wheel("front left"),
                new Wheel("front right"),
                new Wheel("back left"),
                new Wheel("back right"),
                new Body(),
                new Engine()
            };
    }
}