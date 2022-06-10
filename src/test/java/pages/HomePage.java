package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//input [@id = 'FieldDefault']")
    private WebElement search;

    @FindBy (xpath = "(//a [@class = 'styles__CategoryContainer-sc-1sbgiz8-0 kGWouA'])[2]")
    private WebElement farmacia;

    @FindBy (xpath = "//span [@class = 'sc-cSHVUG ifjIuQ']")
    private WebElement direccion;

    public void setSearch(String toSearch) {
        this.search.sendKeys(toSearch);
    }

    public FarmaciasPage clickFarmacia() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(farmacia)).click();
        return new FarmaciasPage(this.getDriver());
    }

    public String getDireccion() {
        return this.direccion.getText();
    }
}
