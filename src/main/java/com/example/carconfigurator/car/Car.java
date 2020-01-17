package com.example.carconfigurator.car;

import com.example.carconfigurator.engine.Engine;

public interface Car {

    String getName();
    Engine getEngine();
    void setColor(String color);
    String getColor();
    void setWheelsSize(int wheelsSize);
    int getWheelsSize();
}
