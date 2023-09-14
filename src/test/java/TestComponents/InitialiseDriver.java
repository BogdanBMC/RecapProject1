

//this is a class for the initialisation of the driver depending on the browser
//creating the first page object in the flow
//and closing the driver

package TestComponents;


import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class InitialiseDriver {

 public  WebDriver driver;
String browser= "firefox";
public LoginPage loginPage;


public  WebDriver initialiseDriver(String browser){

    if(browser.equalsIgnoreCase("firefox")){
        driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    return driver;
}


//opens browser at the start of every test method
@BeforeMethod
    public LoginPage openSite(){
    initialiseDriver(browser);
    loginPage = new LoginPage(driver);
    return loginPage;
}

//closes driver after every test method
@AfterMethod
    public void closeDriver(){
    driver.close();
}





}
