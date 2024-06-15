package secondLife;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static secondLife.Constans.URL_SECOND_LIFE;

public class LoginTest extends Basetest {

    @Test
    @Tag("LoginTest")
    @DisplayName("Successful authorization check")
    void test1() {

        driver.navigate().to(URL_SECOND_LIFE);

        clickOnElement(By.cssSelector("[href='#/auth/user/login']"));

        fillInputField(By.name("email"), "test@google.com");

        fillInputField(By.name("password"), "790633Aa@");

        clickOnElement(By.cssSelector("[class='css-1mk6z5f']"));

        // Assertions.assertTrue(getElement(By.xpath("//button[text()='Sign Out']")).isDisplayed());
    }

    @Test
    @Tag("LoginTests")
    @DisplayName("Checking for incorrect password entry")
    void test2() {

        driver.navigate().to(URL_SECOND_LIFE);
        clickOnElement(By.cssSelector("[href='#/auth/user/login']"));
        fillInputField(By.name("email"), "test@google.com");
        fillInputField(By.name("password"), "790633Aa");
        clickOnElement(By.cssSelector("[class='css-1mk6z5f']"));
        Assertions.assertEquals("Password is incorrect", getAlert().getText(), "Error text doesn't match expected");
    }

}




