import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
    public WebDriver driver;

    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@text='text']")
    public WebElement fieldName;

    @FindBy(xpath = "//*[@id='userEmail']")
    private WebElement fieldEmail;

    @FindBy(id = "currentAddress")
    private WebElement fieldCurrentAdr;

    @FindBy(id = "permanentAddress")
    private WebElement fieldPermamentAdr;

    @FindBy(id = "submit")
    private WebElement button;

    @FindBy(name = "mobilePhone")
    public WebElement fieldPhone;


    public void createTextBox(String fieldNameValue, String fieldEmailValue, String currentAddressValue, String permanentAddressValue) {
        fieldName.sendKeys(fieldNameValue);
        fieldEmail.sendKeys(fieldEmailValue);
        fieldCurrentAdr.sendKeys(currentAddressValue);
        fieldPermamentAdr.sendKeys(permanentAddressValue);
        button.click();
    }
}
