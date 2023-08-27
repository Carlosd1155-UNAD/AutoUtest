package com.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Step4 {
    public static final Target INP_PASSWORD = Target.the("The input text for set the password").locatedBy("//input[@id='password']");
    public static final Target INP_REPEAT_PASSWORD = Target.the("The input text for confirm the password").locatedBy("//input[@id='confirmPassword']");
    public static final Target CHK_TERMS = Target.the("The check for accept the terms of use").locatedBy("//input[@id='termOfUse']");
    public static final Target CHK_PRIVACY = Target.the("The check for accept the privacy policy").locatedBy("//input[@id='privacySetting']");
    public static final Target BTN_COMPLETE_SETUP = Target.the("The button for complete the process").locatedBy("//span[contains(text(),'Complete Setup')]");
}
