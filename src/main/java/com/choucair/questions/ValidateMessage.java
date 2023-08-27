package com.choucair.questions;

import com.choucair.userinterfaces.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMessage implements Question <String>{

    @Override
    public String answeredBy(Actor actor) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Text.of(WelcomePage.LBL_WELCOME).viewedBy(actor).asString();
    }

    public static ValidateMessage showedAs() {return new ValidateMessage();}
}
