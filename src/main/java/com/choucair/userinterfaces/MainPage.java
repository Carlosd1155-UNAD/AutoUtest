package com.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target BTN_JOIN_TODAY = Target.the("The button for join today").located(By.linkText("Join Today"));
}
