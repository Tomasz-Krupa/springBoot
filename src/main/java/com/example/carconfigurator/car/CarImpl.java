package com.example.carconfigurator.car;

import com.example.carconfigurator.engine.Engine;

public class CarImpl implements Car {

    private String name;
    private Engine engine;
    private String color;
    private int wheelsSize;

    public CarImpl(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setWheelsSize(int wheelsSize) {
        this.wheelsSize = wheelsSize;
    }

    @Override
    public int getWheelsSize() {
        return wheelsSize;
    }
}
