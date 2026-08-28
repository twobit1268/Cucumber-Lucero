package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage(Hooks.getDriver());
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        Hooks.getDriver().get("https://the-internet.herokuapp.com/login");
    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        String actualMessage = loginPage.getFlashMessage();
        Assert.assertTrue(
            "Expected: [" + expectedMessage + "] but got: [" + actualMessage + "]",
            actualMessage.contains(expectedMessage)
        );
    }
}
