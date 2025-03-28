package testng.attributes.enablefalsedemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableFalseAttribute {

    @Test
    public void verifyLogin(){

        System.out.println("Verify Login");
    }
    @Test(enabled = false)      //run option got removed so perticular test case got disabled
    public void verifyFundTransfer(){
        System.out.println("Verify Fund Transfer");
    }

    @Test
    public void verifyFundATMOptions(){
        System.out.println("Verify Fund ATM Options");
    }

}
