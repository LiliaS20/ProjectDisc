package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
       super(driver);
    }

    public void login(String userLogin, String userPassword) {
        driver.get("http://localhost/addressbook/");
        type(By.name("user"), userLogin);
        type(By.name("pass"), userPassword);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
