package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployee extends Configurations {

    WebDriver driver;
    public AddEmployee(){
        driver = super.initDriver();
    }

    By userNameTxt = By.xpath("//input[@name='username']");
    By passwordTxt = By.xpath("//input[@name='password']");
    By submitBtn = By.xpath("//button[@type='submit']");

    public void launchLogin(){
        driver.get(super.baseUrl);
    }

    public void login(String userName, String password){
        driver.findElement(userNameTxt).sendKeys(userName);
        driver.findElement(passwordTxt).sendKeys(password);
        driver.findElement(submitBtn).click();
    }
}
