package testng.invocationcount;

import org.testng.annotations.Test;

public class InvocationCountWithTimeoutDemo {

    //@Test(invocationCount=number,invocationTimeOut=10) shows the number of time the pericular test method is executed
    //in given milisecond timeframe--if not executed then it will throw the ThreadTimeoutException

    @Test(invocationCount = 500, invocationTimeOut = 100)
    public void test1() {

        System.out.println(" Method");
    }
}
