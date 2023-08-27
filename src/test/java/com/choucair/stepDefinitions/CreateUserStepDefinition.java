package com.choucair.stepDefinitions;

import com.choucair.questions.ValidateMessage;
import com.choucair.tasks.*;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CreateUserStepDefinition {
    Actor user = Actor.named("Robot");

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void config() {
        user.can(BrowseTheWeb.with(driver));
    }


    @Given("^the user starts the browser$")
    public void theUserStartsTheBrowser() {
        user.wasAbleTo(Open.url("https://utest.com/"));
    }

    @Given("^the user select the register option$")
    public void theUserSelectTheRegisterOption() {
        user.attemptsTo(SelectJoinToday.button());
    }

    @When("^he fills the step 1 using the following information$")
    public void heFillsTheStepUsingTheFollowingInformation(DataTable personalInfo) {
        user.attemptsTo(FillPersonalInformation.intoTheForm(personalInfo));
    }

    @When("^continue filling the location form using the following information$")
    public void continueFillingTheLocationFormUsingTheFollowingInformation(DataTable locationInfo) {
        user.attemptsTo(FillLocation.intoTheForm(locationInfo));
    }

    @When("^in the step 3 he fills the devices form$")
    public void inTheStepHeFillsTheDevicesForm(DataTable devicesInfo) {
        user.attemptsTo(FillDevicesInformation.intoTheForm(devicesInfo));
    }

    @When("^next, the user set a password \"([^\"]*)\"$")
    public void nextTheUserSetAPassword(String userPassword) {
        user.attemptsTo(SetPassword.intoTheForm(userPassword));
    }

    @Then("^finally the user can see the welcome banner \"([^\"]*)\"$")
    public void finallyTheUserCanSeeTheWelcomeBanner(String bannerMessage) {
        user.should(seeThat(ValidateMessage.showedAs(),Matchers.is(bannerMessage)));
    }

}
