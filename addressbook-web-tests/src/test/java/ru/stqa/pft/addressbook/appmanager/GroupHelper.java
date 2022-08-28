package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void initGroupCreation() {
        click(By.xpath("//*[@id='content']/form/input[1]"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(groupData, By.name("group_name"));
        type(By.name("group_header"), groupData.getGroupHeader());
        type(By.name("group_footer"), groupData.getGroupFooter());
    }

    private void type(GroupData groupData, By locator) {
        type(locator, groupData.getGroupName());
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void deleteSelectGroups() {
        click(By.name("delete"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }
}
