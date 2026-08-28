package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CheckboxPage;

public class CheckboxSteps {

    private final CheckboxPage checkboxPage;

    public CheckboxSteps() {
        this.checkboxPage = new CheckboxPage(Hooks.getDriver());
    }

    @Given("I am on the checkboxes page")
    public void iAmOnTheCheckboxesPage() {
        Hooks.getDriver().get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Given("checkbox {int} is unchecked")
    public void checkboxIsUnchecked(int index) {
        if (checkboxPage.isChecked(index)) {
            checkboxPage.clickCheckbox(index);
        }
    }

    @Given("checkbox {int} is checked")
    public void checkboxIsChecked(int index) {
        if (!checkboxPage.isChecked(index)) {
            checkboxPage.clickCheckbox(index);
        }
    }

    @When("I click checkbox {int}")
    public void iClickCheckbox(int index) {
        checkboxPage.clickCheckbox(index);
    }

    @Then("checkbox {int} should be checked")
    public void checkboxShouldBeChecked(int index) {
        Assert.assertTrue("Checkbox " + index + " should be checked", checkboxPage.isChecked(index));
    }

    @Then("checkbox {int} should be unchecked")
    public void checkboxShouldBeUnchecked(int index) {
        Assert.assertFalse("Checkbox " + index + " should be unchecked", checkboxPage.isChecked(index));
    }
}
