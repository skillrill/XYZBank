package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage{

    By customerLoginButton = By.xpath("//button[text()='Customer Login']");
    By managerLoginButton = By.xpath("//button[text()='Bank Manager Login']");
    By customerDropdown = By.id("userSelect");
    By loginButton = By.xpath("//button[text()='Login']");
    By logoutButton = By.xpath("//button[text()='Logout']");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void customerLogin(){
        driver.findElement(customerLoginButton).click();
        Select select  = new Select(driver.findElement(customerDropdown));
        select.selectByVisibleText("Harry Potter");
        driver.findElement(loginButton).click();
    }

    public void managerLogin(){
        driver.findElement(managerLoginButton).click();
    }

    public void customerLogout(){
        driver.findElement(logoutButton).click();
    }



}
