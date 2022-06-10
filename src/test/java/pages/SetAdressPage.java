package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SetAdressPage extends BasePage{

    public SetAdressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input [@class = 'sc-brqgnP eLZQIu']")
    private WebElement direccion;

    @FindBy (xpath = "//li [@class = 'ItemAutoComplete-sc-1ll4vt7 hHtDEi focused']")
    private WebElement confirmarDireccion;


    public void setDireccion(String direccion) {
        this.direccion.sendKeys(direccion);
    }

    public HomePage clickDireccion() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(confirmarDireccion)).click();
        return new HomePage(this.getDriver());
    }

}
