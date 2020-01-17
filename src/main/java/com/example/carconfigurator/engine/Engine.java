package com.example.carconfigurator.engine;

public interface Engine {

    EEngineType getType();
    String getName();
    String getTransmission();
    int getHorsepower();
    int getCC();
}
