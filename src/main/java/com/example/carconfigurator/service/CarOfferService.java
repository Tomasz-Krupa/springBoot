package com.example.carconfigurator.service;

import com.example.carconfigurator.car.Car;

public interface CarOfferService {

    void prepareAndSendOffer (Car car, String email);
}
