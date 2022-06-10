package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductoPage extends BasePage {

    public ProductoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//h4 [@class = 'styles__ProductPrices-sc-wsd7vq-6 hSfMKD']")
    private WebElement precio;

    @FindBy(xpath = "//button [@class = 'sc-fMiknA eohrPu primary wide']")
    private WebElement agregar;

    public String getPrecio() {
        return this.precio.getText();
    }

    public PrimeraFarmaciaPage clickAgregar () {
        this.getWait().until(ExpectedConditions.elementToBeClickable(agregar)).click();
        return new PrimeraFarmaciaPage(this.getDriver());
    }
}
