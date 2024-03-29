package TestSteps.Movies;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static TestSteps.Movies.Hooks.wait;


public class Filter {

    @Given("User at main movies screen")
    public void User_at_main_movies_screen() {
        //validate that user at main screen

            Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.skydoves.themovies:id/toolbar_title"))).isDisplayed());


    }


    @When("User clicks on the details button")
    public void userClicksOnTheDetailsButton() {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.skydoves.themovies:id/item_poster_post"))).get(0).click();

    }

    @Then("User should be redirected to details screen")
    public void userShouldBeRedirectedToDetailsScreen() {
        //validate that user at details screen
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.skydoves.themovies:id/detail_header_release"))).isDisplayed());

    }


}
