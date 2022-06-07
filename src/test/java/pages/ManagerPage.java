package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagerPage extends BasePage{

    By addCustomerButton = By.xpath("//button[contains(text(), 'Add Customer')]");
    By firstNameInput = By.cssSelector("[placeholder='First Name']");
    By lastNameInput = By.cssSelector("[placeholder='Last Name']");
    By postCodeInput = By.cssSelector("[placeholder='Post Code']");
    By addCustomerButton2 = By.xpath("//button[text()='Add Customer']");

    public ManagerPage(WebDriver driver){
        this.driver = driver;
    }

    public void addCustomer(){
        driver.findElement(addCustomerButton).click();
        driver.findElement(firstNameInput).sendKeys("Test");
        driver.findElement(lastNameInput).sendKeys("Test");
        driver.findElement(postCodeInput).sendKeys("555");
        driver.findElement(addCustomerButton2).click();
    }

}
