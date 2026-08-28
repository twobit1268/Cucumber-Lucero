package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DropdownPage;

public class DropdownSteps {

    private final DropdownPage dropdownPage;

    public DropdownSteps() {
        this.dropdownPage = new DropdownPage(Hooks.getDriver());
    }

    @Given("I am on the dropdown page")
    public void iAmOnTheDropdownPage() {
        Hooks.getDriver().get("https://the-internet.herokuapp.com/dropdown");
    }

    @When("I select {string} from the dropdown")
    public void iSelectFromTheDropdown(String option) {
        dropdownPage.selectOption(option);
    }

    @Then("{string} should be selected")
    public void shouldBeSelected(String expected) {
        Assert.assertEquals(expected, dropdownPage.getSelectedOption());
    }
}
