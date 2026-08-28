package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    @FindBy(id = "dropdown")
    private WebElement dropdownElement;

    public DropdownPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void selectOption(String optionText) {
        waitForVisible(dropdownElement);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(optionText);
    }

    public String getSelectedOption() {
        Select dropdown = new Select(dropdownElement);
        return dropdown.getFirstSelectedOption().getText();
    }
}
