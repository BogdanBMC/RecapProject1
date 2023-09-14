
//test class for login


package Tests;

import TestComponents.InitialiseDriver;
import org.testng.annotations.Test;

public class LoginTest extends InitialiseDriver {

    String url="https://www.rahulshettyacademy.com/client/";
    String pass = "Testtest123?";
    String prod =  "iphone 13 pro";
    String email ="testaugust@gmail.com";





    @Test
    public void login(){
            loginPage.login(email,pass,url); 
    }

}
