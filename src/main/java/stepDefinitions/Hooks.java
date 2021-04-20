package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before //("@forhooks")
    public void init()
    {
        System.out.println("===== this is before ====>");
    }

    @After //("@forhooks")
    public void  exit()
    {
        System.out.println("===== this is After ====>");
    }
}
