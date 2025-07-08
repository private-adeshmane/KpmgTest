package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configurations {
    public String baseUrl= "https://opensource-demo.orangehrmlive.com/";

    public WebDriver initDriver(){
        return  new ChromeDriver();
    }
}
