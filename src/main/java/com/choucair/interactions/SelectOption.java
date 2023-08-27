package com.choucair.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.support.ui.Select;

public class SelectOption implements Interaction {

    private final String option;
    private final Target target;

    public SelectOption(String option, Target target) {
        this.option = option;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade element = target.resolveFor(actor);
        Select select = new Select(element);
        select.selectByVisibleText(option);
    }

    public static SelectOption fromTarget(String option, Target target){
        return new SelectOption(option,target);
    }
}
