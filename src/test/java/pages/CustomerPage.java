package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage extends BasePage{

    By transactionsButton = By.xpath("//button[contains(text(), 'Transactions')]");

    public CustomerPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickTransactionsButton(){
        driver.findElement(transactionsButton).click();
    }



}
