package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FarmaciasPage extends BasePage {

    public FarmaciasPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//h2 [@class = 'sc-jKJlTe pBJgF styles__ResourceTitle-sc-1fpso54-2 jOhVLT']")
    private WebElement titulo;

    @FindBy (xpath = "//div [@class = 'styles__StoreCardContainer-sc-j5j8go-0 fKKXix']")
    private WebElement primeraFarmacia;

    public String getTitilo () {
        return this.titulo.getText();
    }

    public PrimeraFarmaciaPage clickPrimeraFarmacia() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(primeraFarmacia)).click();
        return new PrimeraFarmaciaPage(this.getDriver());
    }

}
