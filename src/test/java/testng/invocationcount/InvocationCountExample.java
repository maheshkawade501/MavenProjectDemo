package testng.invocationcount;

import org.testng.annotations.Test;

public class InvocationCountExample {

    //@Test(invocationCount=number) shows the number of time the pericular test method is executed

    @Test(invocationCount = 50)
    public void test1() {

        System.out.println(" Method");

    }
}
