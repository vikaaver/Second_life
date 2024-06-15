package secondLife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static secondLife.Constans.URL_SECOND_LIFE;

public class FurnitureAndHomeDecorTests extends Basetest {

    @Test
    @Tag("CategoriesTest")
    @DisplayName(" Open categories Page - Furniture and Home Decor")
    void test1() {
        driver.navigate().to(URL_SECOND_LIFE);
        clickOnElement(By.cssSelector("[href='#/category']"));
        clickOnElement(By.cssSelector("[href='#/category/id=2']"));
        Assertions.assertTrue(getElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[1]/div")).isDisplayed());
    }

    @Test
    @Tag("CategoriesTest")
    @DisplayName(" Furniture and Home Decor checking 1 buyout")
    void test2() {
        driver.navigate().to(URL_SECOND_LIFE);
        clickOnElement(By.cssSelector("[href='#/category']"));
        clickOnElement(By.cssSelector("[href='#/category/id=2']"));
        clickOnElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div/div[1]/div/div[2]/a"));
        clickOnElement(By.cssSelector("[class='css-jfag8a']"));
    }

    @Test
    @Tag("CategoriesTest")
    @DisplayName(" Furniture and Home Decor checking make a bid 1")
    void test3() {
        driver.navigate().to(URL_SECOND_LIFE);
        clickOnElement(By.cssSelector("[href='#/category']"));
        clickOnElement(By.cssSelector("[href='#/category/id=2']"));
        clickOnElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div/div[1]/div/div[2]/a"));
        fillInputField(By.cssSelector("[class='css-h7eszq']"), "0");
        clickOnElement(By.cssSelector("[class='css-15y3b4e']"));
    }





    }




