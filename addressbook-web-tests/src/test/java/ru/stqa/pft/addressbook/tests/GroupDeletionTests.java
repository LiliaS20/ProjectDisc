package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends BaseTest {

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectGroups();
        app.getGroupHelper().returnToGroupPage();
    }
}
