package com.choucair.tasks;

import com.choucair.interactions.SelectOption;
import com.choucair.userinterfaces.Step1;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FillPersonalInformation implements Task {

    private final Map<String, String> personalData;

    public FillPersonalInformation(DataTable data) {
        List<Map<String, String>> aux = data.asMaps(String.class, String.class);
        personalData = new HashMap<>();
        for ( Map<String, String> rows : aux) {
            personalData.putAll(rows);
        }
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(personalData.get("First name")).into(Step1.INP_FIRST_NAME),
                Enter.theValue(personalData.get("Last name")).into(Step1.INP_LAST_NAME),
                Enter.theValue(personalData.get("Email")).into(Step1.INP_EMAIL),
                SelectOption.fromTarget(personalData.get("Birth Month"),Step1.INP_BIRTH_MONTH),
                SelectOption.fromTarget(personalData.get("Birth Day"),Step1.INP_BIRTH_DAY),
                SelectOption.fromTarget(personalData.get("Birth Year"),Step1.INP_BIRTH_YEAR),
                Click.on(Step1.INP_SPOKEN_LANGUAGES),
                Enter.theValue(personalData.get("Languages spoken")).into(Step1.INP_SPOKEN_LANGUAGES).thenHit(Keys.ENTER),
                Click.on(Step1.BTN_NEXT)
        );
    }

    public static FillPersonalInformation intoTheForm(DataTable personalData) {
        return Tasks.instrumented(FillPersonalInformation.class,personalData);}
}
