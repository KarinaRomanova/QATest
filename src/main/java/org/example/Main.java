package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();


            driver.get("https://www.avito.ru/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363");

            WebElement fav = driver.findElement(By.xpath("//div [@class=\"style-header-add-favorite-M7nA2\"][1]"));
            fav.click();
            WebElement fav_header = driver.findElement(By.xpath("//div [@class=\"desktop-1rdftp2\"]"));
            fav_header.click();
            

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.close();
        }


    }
    }
