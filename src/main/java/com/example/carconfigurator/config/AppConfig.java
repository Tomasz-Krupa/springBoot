package com.example.carconfigurator.config;

import com.example.carconfigurator.car.Car;
import com.example.carconfigurator.car.CarImpl;
import com.example.carconfigurator.engine.EEngineType;
import com.example.carconfigurator.engine.Engine;
import com.example.carconfigurator.engine.EngineImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Value("${engine.petrol.20:}")
    private String enginePetrol20Name;

    @Value("${engine.petrol.22:}")
    private String enginePetrol22Name;

    @Value("${engine.diesel.20:}")
    private String engineDiesel20Name;

    @Value("${engine.diesel.25:}")
    private String engineDiesel25Name;

    @Value("${car.mazda.cx5:}")
    private String carMazdaCx5Name;

    @Value("${car.mazda.6:}")
    private String carMazda6Name;

    @Value("${car.mazda.3:}")
    private String carMazda3Name;

    @Bean("enginePetrol20")
    public Engine enginePetrol20() {return  new EngineImpl(EEngineType.PETROL, enginePetrol20Name, 165, "6MT", 1988);
    }

    @Bean("enginePetrol25")
    public Engine enginePetrol25() {return  new EngineImpl(EEngineType.PETROL, enginePetrol20Name, 194, "6AT", 2488);
    }

    @Bean("enginePetrol22")
    public Engine enginePetrol22() {return  new EngineImpl(EEngineType.PETROL, enginePetrol20Name, 184, "6AT", 2191);
    }

 @Bean("engineDiesel20")
    public Engine engineDiesel20() {return  new EngineImpl(EEngineType.DIESEL, engineDiesel20Name, 180, "6AT", 2191);
    }

    @Bean("mazda6Petrol20")
    @Scope("prototype")
    public Car mazda6Petrol20() {return  new CarImpl(carMazda6Name, enginePetrol20());
    }

    @Bean("mazda6Petrol22")
    @Scope("prototype")
    public Car mazda6Petrol22() {return  new CarImpl(carMazda6Name, enginePetrol22());
    }

    @Bean("mazda6Petrol25")
    @Scope("prototype")
    public Car mazda6Petrol25() {return  new CarImpl(carMazda6Name, enginePetrol25());
    }
    @Bean("mazdaCx5Petrol20")
    @Scope("prototype")
    public Car mazdaCx5Petrol20() {return  new CarImpl(carMazdaCx5Name, enginePetrol20());
    }

    @Bean("mazdaCx5Petrol22")
    @Scope("prototype")
    public Car mazdaCx5Petrol22() {return  new CarImpl(carMazdaCx5Name, enginePetrol22());
    }

    @Bean("mazdaCx5Petrol25")
    @Scope("prototype")
    public Car mazdaCx5Petrol25() {return  new CarImpl(carMazdaCx5Name, enginePetrol25());
    }

    @Bean("mazda3Diesel20")
    @Scope("prototype")
    public Car mazda3Siesel20() {return  new CarImpl(carMazda3Name, engineDiesel20());
    }




}
