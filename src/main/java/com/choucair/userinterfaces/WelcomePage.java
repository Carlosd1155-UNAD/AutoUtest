package com.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class WelcomePage {
    public static final Target LBL_WELCOME = Target.the("The welcome text").locatedBy("//div[@class='image-box-header']/h1[contains(text(),'Welcome')]");
}
