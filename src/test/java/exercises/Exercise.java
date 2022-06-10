package exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class Exercise {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rappi.com/");
    }

    @Test
    public void main() {
        ChooseAdressPage home = new ChooseAdressPage(driver);
        home.clickAceptar();
        String direccion = "Paraguay 2141";
        home.setDireccion(direccion);
//        home.enter();

        HomePage homePage = home.clickDireccion();
        //Assert.assertEquals(homePage.getDireccion(), direccion);
        FarmaciasPage farmacia = homePage.clickFarmacia();
        Assert.assertEquals(farmacia.getTitilo(), "Farmacia");
        PrimeraFarmaciaPage primeraFarmacia = farmacia.clickPrimeraFarmacia();
        ProductoPage producto = primeraFarmacia.clickPrimeraOferta();
       // String precioProducto = producto.getPrecio();
        primeraFarmacia = producto.clickAgregar();

        CarritoPage carrito = primeraFarmacia.irCarrito();
        //Assert.assertEquals(carrito.getPrecio(), precioProducto);
        //Assert.assertEquals(carrito.getDireccion(), direccion);

        //primeraFarmacia.clickExitPopUp();
        IniciarSesionPage inicio = carrito.irPagar();
        Assert.assertEquals(inicio.getTitulo(), "Iniciar sesión");

        //SetAdressPage setAdress = home.clickIngresarDireccion();
        // setAdress.setDireccion("Paraguay 2141");
    }
}
