package co.com.choucair.utest.stepdefinitions;

import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.questions.Answer;
import co.com.choucair.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class StepDefinitionCreate {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^the user is on the main page of the web application$")
    public void theUserIsOnTheMainPageOfTheWebApplication()  {

        OnStage.theActorCalled("Juanes").wasAbleTo(Starting.thePage());

    }

    @When("^the user clicks the Join today button$")
    public void theUserClicksTheJoinTodayButton()  {

        OnStage.theActorInTheSpotlight().attemptsTo(Join.today());

    }

    @When("^enter form one data$")
    public void enterFormOneData(List<UtestData> utestData)  {

        OnStage.theActorInTheSpotlight().attemptsTo(CompleteFormOne.formOne(utestData));

    }

    @When("^enter form data two$")
    public void enterFormDataTwo(List<UtestData> utestData)  {

        OnStage.theActorInTheSpotlight().attemptsTo(CompleteFormTwo.formTwo(utestData));

    }

    @When("^select the data in form three$")
    public void selectTheDataInFormThree()  {

        OnStage.theActorInTheSpotlight().attemptsTo(CompleteFormThree.formThree());

    }

    @When("^create a valid password$")
    public void createAValidPassword(List<UtestData> utestData)  {

        OnStage.theActorInTheSpotlight().attemptsTo(Create.valid(utestData));

    }

    @Then("^verify that the user was created successfully$")
    public void verifyThatTheUserWasCreatedSuccessfully(List<UtestData> utestData)  {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.verify(utestData), Matchers.equalTo(utestData.get(0).getConfirm())));

    }
}
