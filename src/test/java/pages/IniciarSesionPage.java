package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IniciarSesionPage extends BasePage {

    public IniciarSesionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//span [@class = 'sc-bdfBQB cvQKMr styles__SubTitle-sc-b1pk4f-2 hIBBTP']")
    private WebElement titulo;

    public String getTitulo() {
        return this.titulo.getText();
    }
}
