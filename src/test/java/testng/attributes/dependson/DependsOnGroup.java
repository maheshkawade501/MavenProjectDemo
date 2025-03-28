package testng.attributes.dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    //@Test(groups={"smoke"}) this attribute  is  how,defiend as smoke and based on smoke test cases the actual test method runs


    @Test(groups = {"smoke"})
    public void verifyLogin(){
        //Assert.assertTrue(false); //forcefully failed this test
        System.out.println("Verify Login");
    }
    @Test(dependsOnGroups = {"smoke"})  ///this test case will be skipped as group case is failed
    public void verifyFundTransfer(){
        System.out.println("Verify Fund Transfer");
    }

    @Test
    public void verifyFundATMOptions(){
        System.out.println("Verify Fund ATM Options");
    }

}
