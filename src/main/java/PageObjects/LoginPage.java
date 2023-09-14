
//this class is for the login page object
//locators and functionalities


package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

@FindBy(id = "userEmail")
    WebElement emailelement;

    @FindBy (id = "userPassword")
    WebElement passElement;

    @FindBy (id = "login")
    WebElement loginButton;


    public void login(String email, String pass, String url){
        driver.get(url);
        emailelement.sendKeys(email);
        passElement.sendKeys(pass);
        loginButton.click();
    }









}
