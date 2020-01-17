package com.example.carconfigurator.engine;

public class EngineImpl implements Engine {

    private EEngineType type;
    private String name;
    private int horsepower;
    private String transmission;
    private int cc;

    public EngineImpl(EEngineType type, String name, int horsepower, String transmission, int cc) {
        this.type = type;
        this.name = name;
        this.horsepower = horsepower;
        this.transmission = transmission;
        this.cc = cc;
    }

    @Override
    public EEngineType getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTransmission() {
        return transmission;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public int getCC() {
        return cc;
    }
}
