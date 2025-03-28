package testng.prioritydemo;

import org.testng.annotations.Test;

public class PriorityExample {

    //Priority is applicable to only @Test annotation only not on other annotation
    //TestNG by default follow the alfabetical order only asby default prioriryt consifered as 0
    //We can define userdefined priority @Test(priority=1)
    //Prioiryt can be given negative or positive
    // (order of run will be larget negative to positive,and if same priority then run with alphabetical order),
    // Ascii character can be used --we need to convert it in number
    //Decimal Priority not used


    @Test(priority = 1 )
    public void testC() {

        System.out.println("TestC Method");

    }
    @Test(priority = -2)
    public void testB() {
        System.out.println("TestB Method");
    }


    @Test(priority = 2)
    public void testD() {

        System.out.println("TestD Method");

    }

    @Test(priority = 1)
    public void testA() {

        System.out.println("TestA Method");

    }

    @Test(groups = {"smoke"})
    public void testE() {

        System.out.println("Test Method without prioirty");

    }

}
