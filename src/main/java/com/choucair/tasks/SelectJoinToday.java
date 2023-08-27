package com.choucair.tasks;

import com.choucair.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectJoinToday implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.BTN_JOIN_TODAY)
        );
    }

    public static SelectJoinToday button() {return Tasks.instrumented(SelectJoinToday.class);}
}
