package tests;

import org.testng.annotations.Test;

public class AvByTest extends BaseTest {

@Test
public void loginTest() {

    loginPage.openPage();
    loginPage.login("poltosik_92@mail.ru", "poltosik");

    }
}

