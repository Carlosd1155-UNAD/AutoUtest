package com.choucair.tasks;

import com.choucair.interactions.Wait;
import com.choucair.userinterfaces.Step2;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FillLocation implements Task {

    private final Map<String, String> locationData;

    public FillLocation(DataTable data) {
        List<Map<String, String>> aux = data.asMaps(String.class, String.class);
        locationData = new HashMap<>();
        for ( Map<String, String> rows : aux) {
            locationData.putAll(rows);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(locationData.get("City")+" "+locationData.get("Country")).into(Step2.INP_CITY),
                Wait.forAFewSeconds(2),
                SendKeys.of(String.valueOf(Keys.DOWN)).into(Step2.INP_CITY),
                SendKeys.of(String.valueOf(Keys.ENTER)).into(Step2.INP_CITY),
                Enter.theValue(locationData.get("Zip code")).into(Step2.INP_ZIP_CODE),
                Click.on(Step2.BTN_NEXT)
        );
    }

    public static FillLocation intoTheForm(DataTable locationData) {
        return Tasks.instrumented(FillLocation.class, locationData);}
}
