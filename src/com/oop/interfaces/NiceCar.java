package com.oop.interfaces;

import javax.print.attribute.standard.Media;

public class NiceCar {
    private Engine engine;
    private MultiMedia media;

    NiceCar(){
        this.engine = new PowerEngine();
        this.media = new AppleMultiMedia();
    }


    public void start(){
        this.engine.start();
    }

    public void stop(){
        this.engine.stop();
    }

    public void startMedia(){
        this.media.start();
    };

    public void stopMedia(){
        this.media.stop();
    }

   public void upgradeEngine(){
        this.engine = new ElectricEngine();
   }



}
