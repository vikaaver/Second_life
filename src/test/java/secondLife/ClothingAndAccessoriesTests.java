package secondLife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static secondLife.Constans.URL_SECOND_LIFE;

public class ClothingAndAccessoriesTests extends Basetest{

    @Test
    @Tag("CategoriesTest")
    @DisplayName(" Open categories Page - Clothing and Accessories")
    void test1() {
        driver.navigate().to(URL_SECOND_LIFE);
        clickOnElement(By.cssSelector("[href='#/category']"));
        clickOnElement(By.cssSelector("[href='#/category/id=3']"));
        Assertions.assertTrue(getElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[1]/div")).isDisplayed());
    }

    @Test
    @Tag("CategoriesTest")
    @DisplayName("Clothing and Accessories checking card 1")
    void test2() {
        driver.navigate().to(URL_SECOND_LIFE);
        clickOnElement(By.cssSelector("[href='#/category']"));
        clickOnElement(By.cssSelector("[href='#/category/id=3']"));
        clickOnElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div/div[1]/div/div[2]/a"));
        clickOnElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[1]/button"));
    }
}
