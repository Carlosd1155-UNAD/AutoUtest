package com.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Step1 {
    public static final Target INP_FIRST_NAME = Target.the("The input text for first name").locatedBy("//input[@id='firstName']");
    public static final Target INP_LAST_NAME = Target.the("The input text for last name").locatedBy("//input[@id='lastName']");
    public static final Target INP_EMAIL = Target.the("The input text for user's email").locatedBy("//input[@id='email']");
    public static final Target INP_BIRTH_MONTH = Target.the("The input text for user's birth month").locatedBy("//select[@id='birthMonth']");
    public static final Target INP_BIRTH_DAY = Target.the("The input text for user's birth day").locatedBy("//select[@id='birthDay']");
    public static final Target INP_BIRTH_YEAR = Target.the("The input text for user's birth year").locatedBy("//select[@id='birthYear']");
    public static final Target INP_SPOKEN_LANGUAGES = Target.the("The input text for user's spoken languages").locatedBy(".ui-select-search");
    public static final Target BTN_NEXT = Target.the("The button for got the next step").locatedBy("//span[contains(text(),'Next: Location')]");
}
