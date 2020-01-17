package com.example.carconfigurator.service;

import com.example.carconfigurator.car.Car;
import com.example.carconfigurator.creator.CarOfferCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CarOfferServiceImpl implements CarOfferService{

    private static final Logger LOG= LoggerFactory.getLogger(CarOfferServiceImpl.class);

    private CarOfferCreator carOfferCreator;

    public CarOfferServiceImpl (CarOfferCreator carOfferCreator)
    { this.carOfferCreator=carOfferCreator;}

    @Override
    public void prepareAndSendOffer(Car car, String email) {

        String offer= carOfferCreator.createCarOffer(car);

        LOG.info(offer);

        LOG.info("Sending offer to {} .... Sent", email);
    }
}
