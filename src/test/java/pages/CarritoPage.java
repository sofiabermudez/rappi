package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarritoPage extends BasePage {

    public CarritoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//div [@class = 'ButtonContainer-sc-5f7sxl eTuyUj']")
    private WebElement pagar;

    @FindBy (xpath = "(//span [@class = 'sc-cSHVUG ifjIuQ'])[2]")
    private WebElement direccion;

    @FindBy (xpath = "//span [@class = 'sc-bdVaJa eAqddL ProductValue-sc-hf5t3s cKPKSm']")
    private WebElement precio;

    public String getPrecio() {
        return this.precio.getText();
    }

    public String getDireccion() {
        return this.direccion.getText();
    }

    public IniciarSesionPage irPagar () {
        this.getWait().until(ExpectedConditions.elementToBeClickable(pagar)).click();
        return new IniciarSesionPage(this.getDriver());
    }
}
