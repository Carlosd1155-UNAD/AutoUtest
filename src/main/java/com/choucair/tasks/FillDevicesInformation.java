package com.choucair.tasks;

import com.choucair.userinterfaces.Step3;
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

public class FillDevicesInformation implements Task {

    private final Map<String, String> devicesData;

    public FillDevicesInformation(DataTable data) {
        List<Map<String, String>> aux = data.asMaps(String.class, String.class);
        devicesData = new HashMap<>();
        for ( Map<String, String> rows : aux) {
            devicesData.putAll(rows);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Step3.SPN_PC_OS),
                Enter.theValue(devicesData.get("PC OS")).into(Step3.INP_PC_OS).thenHit(Keys.ENTER),
                Click.on(Step3.SPN_PC_OS_VERSION),
                Enter.theValue(devicesData.get("PC OS Version")).into(Step3.INP_PC_OS_VERSION).thenHit(Keys.ENTER),
                Click.on(Step3.SPN_PC_OS_LANGUAGE),
                Enter.theValue(devicesData.get("PC OS Language")).into(Step3.INP_PC_OS_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(Step3.SPN_MOBILE_BRAND),
                Enter.theValue(devicesData.get("Mobile brand")).into(Step3.INP_MOBILE_BRAND).thenHit(Keys.ENTER),
                Click.on(Step3.SPN_MOBILE_MODEL),
                Enter.theValue(devicesData.get("Mobile model")).into(Step3.INP_MOBILE_MODEL).thenHit(Keys.ENTER),
                Click.on(Step3.SPN_MOBILE_OS),
                Enter.theValue(devicesData.get("Mobile OS")).into(Step3.INP_MOBILE_OS).thenHit(Keys.ENTER),
                Click.on(Step3.BTN_NEXT)
        );
    }

    public static FillDevicesInformation intoTheForm(DataTable devicesData) {
        return Tasks.instrumented(FillDevicesInformation.class, devicesData);}
}
