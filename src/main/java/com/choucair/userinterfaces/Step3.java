package com.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Step3 {
    public static final Target SPN_PC_OS = Target.the("The span for select the pc OS").locatedBy("//div[1]/div[1]/div[2]//span[@aria-label='Select OS']");
    public static final Target INP_PC_OS = Target.the("The input text for select the pc OS").locatedBy("//div[3]/div[1]/div[1]/div[2]/div[1]/input[@type='search']");
    public static final Target SPN_PC_OS_VERSION = Target.the("The span for select the pc OS version").locatedBy("//span[@aria-label='Select a Version']");
    public static final Target INP_PC_OS_VERSION = Target.the("The input text for select the pc OS version").locatedBy("//div[1]/div[2]/div[2]/div[1]/input[@type='search']");
    public static final Target SPN_PC_OS_LANGUAGE = Target.the("The span for select the pc OS language").locatedBy("//span[@aria-label='Select OS language']");
    public static final Target INP_PC_OS_LANGUAGE = Target.the("The input text for select the pc OS language").locatedBy("//div[1]/div[3]/div[2]/div[1]/input[@type='search']");
    public static final Target SPN_MOBILE_BRAND = Target.the("The span for select the mobile brand").locatedBy("//span[@aria-label='Select Brand']");
    public static final Target INP_MOBILE_BRAND = Target.the("The input text for select the mobile brand").locatedBy("//div[2]/div[1]/div[2]/div[1]/input[@type='search']");
    public static final Target INP_MOBILE_MODEL = Target.the("The input text for select the mobile model").locatedBy("//div[2]/div[2]/div[2]/div[1]/input[@type='search']");
    public static final Target SPN_MOBILE_MODEL = Target.the("The span for select the mobile model").locatedBy("//span[@aria-label='Select a Model']");
    public static final Target INP_MOBILE_OS = Target.the("The input text for select the mobile OS").locatedBy("//div[2]/div[3]/div[2]/div[1]/input[@type='search']");
    public static final Target SPN_MOBILE_OS = Target.the("The span for select the mobile OS").locatedBy("//div[3]/div[2]//span[@aria-label='Select OS']");
    public static final Target BTN_NEXT = Target.the("The button for go to the next step").locatedBy("//span[contains(text(),'Next: Last Step')]");
}
