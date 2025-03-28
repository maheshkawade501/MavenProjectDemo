package testng.attributes.alwaysrundemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample {

    @Test(groups = {"smoke"})
    public void verifyLogin(){
     //   Assert.assertTrue(false); //forcefully failed this test
        System.out.println("Verify Login");
    }
    @Test(dependsOnGroups = {"smoke"},alwaysRun = true)  ///this test case will run although its depends on group/Method is failed
    public void verifyFundTransfer(){
        System.out.println("Verify Fund Transfer");
    }

    @Test
    public void verifyFundATMOptions(){
        System.out.println("Verify Fund ATM Options");
    }

}
