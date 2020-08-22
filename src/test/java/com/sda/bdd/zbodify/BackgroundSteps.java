package com.sda.bdd.zbodify;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {

    @Given ("I am logged in")
    public void iAmLoggedIn() {
        System.out.println("I am logged in");
    }

    @When("I click on a song to start playing")
    public void iClickOnASongToStartPlaying() { System.out.println("I click on a song to start playing");
    }

    @And("I open the home screen")
    public void IOpenTheHomeScreen() { System.out.println("I open the home screen");
    }

    @Then("the song continues to play")
    public void TheSongContinuesToPlay() {System.out.println("the song continues to play");
    }

    @And("I can open the home screen")
    public void ICanOpenTheHomeScreen() { System.out.println("I can open the home screen");
    }

}
