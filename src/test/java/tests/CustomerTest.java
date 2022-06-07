package tests;

import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.LoginPage;

public class CustomerTest extends BaseTest{

    @Test
    public void testCustomerViewTransactions(){
        logger.info("############## Test Case: View Transactions as Customer");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerPage customer = new CustomerPage(driver);
        customer.clickTransactionsButton();
        textExists("Transaction Type");
    }

}
