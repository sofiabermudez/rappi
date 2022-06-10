package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChooseAdressPage extends BasePage {

    public ChooseAdressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input [@class = 'sc-bZSRNg laKUQZ']")
    private WebElement direccion;

    @FindBy (xpath = "//li [@class = 'sc-iBaQBe kWiBLV focused']")
    private WebElement confirmarDireccion;

    @FindBy (xpath = "//div [@class = 'AddressContainer-sc-1w6rvo6 jCcdsv']")
    private WebElement ingresarDireccion;

    @FindBy (xpath = "//div [@class = 'content-button']")
    private WebElement aceptar;

    public void setDireccion(String direccion) {
        this.direccion.sendKeys(direccion);
        //this.direccion.sendKeys(Keys.ENTER);
    }

    public void enter() {
        this.direccion.sendKeys(Keys.ENTER);
    }

    public HomePage clickDireccion() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(confirmarDireccion)).click();
        return new HomePage(this.getDriver());
    }

    public void clickDire() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(direccion)).click();
    }

    public SetAdressPage clickIngresarDireccion() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(ingresarDireccion)).click();
        return new SetAdressPage(this.getDriver());
    }

    public void clickAceptar() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(aceptar)).click();
    }
}
