package testng.annotation;

import org.testng.annotations.*;

public class BeforeTestExample extends BeforeSuiteExample {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }


    @Test
    public void testMethod1(){
        System.out.println("Test Method1");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
    @Test
    public void testMethod2(){
        System.out.println("Test Method2");
    }

}
