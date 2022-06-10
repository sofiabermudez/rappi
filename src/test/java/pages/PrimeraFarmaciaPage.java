package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PrimeraFarmaciaPage extends BasePage {

    public PrimeraFarmaciaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div [@class = 'style__Container-sc-r27pq8-1 dpRiFJ']")
    private WebElement primeraOferta;

    @FindBy (xpath = "//button [@class = 'CloseButton-sc-1civndm jsgBPb']")
    private WebElement exitPopUp;

    @FindBy (xpath = "//div [@class = 'BasketButtonContainer-sc-j4ax6b hJPvXF']")
    private WebElement carrito;

    ////button [@class = 'sc-eHgmQL kxvrTu primary small']"
    //span [@class = 'sc-cvbbAY fznRLj']

    public ProductoPage clickPrimeraOferta() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(primeraOferta)).click();
        return new ProductoPage(this.getDriver());
    }

    public void clickExitPopUp () {
        this.getWait().until(ExpectedConditions.elementToBeClickable(carrito)).click();
    }

    public CarritoPage irCarrito () {
        this.getWait().until(ExpectedConditions.elementToBeClickable(carrito)).click();
        return new CarritoPage(this.getDriver());
    }



    ////button [@class = 'sc-bwzfXH jqhmHx primary small']
    //CloseButton-sc-1civndm jsgBPb
}
