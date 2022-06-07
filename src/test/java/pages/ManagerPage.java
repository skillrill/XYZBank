package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagerPage extends BasePage{

    By transactionsButton = By.xpath("//button[contains(text(), 'Transactions')]");

    public ManagerPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickTransactionsButton(){
        driver.findElement(transactionsButton).click();
    }

}
