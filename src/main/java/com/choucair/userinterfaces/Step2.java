package com.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Step2 {
    public static final Target INP_CITY = Target.the("The input text for user's city").locatedBy("//input[@id='city']");
    public static final Target INP_ZIP_CODE = Target.the("The input text for user's zip code").locatedBy("//input[@id='zip']");
    public static final Target BTN_NEXT = Target.the("The button for go to the next step").locatedBy("//a[@role='button' and @class='btn btn-blue pull-right']");
}
