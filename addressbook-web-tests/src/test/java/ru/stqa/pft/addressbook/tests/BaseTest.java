package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class BaseTest {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void SetUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown()  {
        app.stop();
    }

}
