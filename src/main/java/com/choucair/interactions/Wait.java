package com.choucair.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Wait implements Interaction {
    private final int seconds;

    public Wait(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Wait forAFewSeconds(int seconds){
        return new Wait(seconds);
    }
    public static Wait aRandomTime(){
        return new Wait((int) Math.floor(Math.random()*10+1));
    }
}
