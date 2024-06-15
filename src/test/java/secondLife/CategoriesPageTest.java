package secondLife;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static secondLife.Constans.URL_SECOND_LIFE;

public class CategoriesPageTest extends Basetest{

    @Test
    @Tag("CategoriesTest")
    @DisplayName(" categories Page - Furniture and Home Decor")
    void test1(){
        driver.navigate().to(URL_SECOND_LIFE);
        clickOnElement(By.cssSelector("[href='#/category']"));
        clickOnElement(By.cssSelector("[href='#/category/id=2']"));
//        clickOnElement(By.cssSelector("[class='css-1g614w6']"));
//        Assertions.assertTrue(getElement(By.xpath("//[text()='Furniture and Home Decor']")).isDisplayed());
    }
    @Test
    @Tag("CategoriesTest")
    @DisplayName(" Furniture and Home Decor checking Apply")
    void test2() {
        driver.navigate().to(URL_SECOND_LIFE);
        clickOnElement(By.cssSelector("[href='#/category']"));
        clickOnElement(By.cssSelector("[href='#/category/id=2']"));
        clickOnElement(By.cssSelector("[class='css-1g614w6']"));
    }

    }


