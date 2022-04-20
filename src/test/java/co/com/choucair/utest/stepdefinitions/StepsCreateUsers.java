package co.com.choucair.utest.stepdefinitions;

import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.questions.Validate;
import co.com.choucair.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;



public class StepsCreateUsers {


    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }


    @Given("^the user is on the main page of the web application$")
    public void theUserIsOnTheMainPageOfTheWebApplication()  {

        theActorCalled("Juanes").wasAbleTo(OpenUp.thePage());

    }

    @When("^the user fills in all the required information fields$")
    public void theUserFillsInAllTheRequiredInformationFields(List<UtestData> utestData) {

        theActorInTheSpotlight().attemptsTo(Start.theForms(),
                Define.personalInformation(utestData),
                Add.geographicLocationData(utestData),
                Complete.deviceInformation(),
                Create.passwords(utestData)
                );
    }


    @Then("^verify that the user was created successfully$")
    public void verifyThatTheUserWasCreatedSuccessfully(List<UtestData> utestData)  {

        theActorInTheSpotlight().should(seeThat(Validate.theResults(utestData)));

    }


}
