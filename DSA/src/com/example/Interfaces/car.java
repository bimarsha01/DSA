package com.example.Interfaces;

public class car implements brake, media , engine{
    @Override
    public void brake() {
        System.out.println("Example of the interface");
    }

    @Override
    public void start() {
        System.out.println("there is something");
    }

    @Override
    public void stop() {

    }

    @Override
    public void acc() {

    }
}
