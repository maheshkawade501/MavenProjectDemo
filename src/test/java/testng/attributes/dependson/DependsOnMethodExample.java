package testng.attributes.dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    //@Test(dependsOnMethods ="MethodName" )  this attribute will allow us to run the perticular test case based on another depedant method
//If dependent method passed then only this child method will execute otherwise it will skipped.
    //Rarely used as parallel execution happens

    @Test
    public void verifyLogin(){
//        Assert.assertTrue(false); //forcefully failed this test
        System.out.println("Verify Login");
    }
    @Test(dependsOnMethods = {"verifyLogin"}) /////this test case will be skipped as method is failed
    public void verifyFundTransfer(){
        System.out.println("Verify Fund Transfer");
    }

    @Test
    public void verifyFundATMOptions(){
        System.out.println("Verify Fund ATM Options");
    }

}
