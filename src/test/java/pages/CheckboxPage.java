package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckboxPage extends BasePage {

    @FindBy(css = "#checkboxes input[type='checkbox']")
    private List<WebElement> checkboxes;

    public CheckboxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isChecked(int index) {
        return checkboxes.get(index - 1).isSelected();
    }

    public void clickCheckbox(int index) {
        waitForClickable(checkboxes.get(index - 1));
        checkboxes.get(index - 1).click();
    }
}
