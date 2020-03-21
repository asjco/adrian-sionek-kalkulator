package com.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {

        Kalkulator calculator = new Kalkulator();

        System.out.println("Result : "+calculator.addAtoB(3,5));

    }

}
