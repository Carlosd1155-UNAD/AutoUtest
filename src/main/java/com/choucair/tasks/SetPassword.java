package com.choucair.tasks;

import com.choucair.interactions.Wait;
import com.choucair.userinterfaces.Step4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SetPassword implements Task {

    private final String password;

    public SetPassword(String password) {
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(Step4.INP_PASSWORD),
                Enter.theValue(password).into(Step4.INP_REPEAT_PASSWORD),
                Click.on(Step4.CHK_TERMS),
                Click.on(Step4.CHK_PRIVACY),
                Wait.aRandomTime(),
                Click.on(Step4.BTN_COMPLETE_SETUP)
        );
    }

    public static SetPassword intoTheForm(String password){
        return Tasks.instrumented(SetPassword.class,password);
    }
}
