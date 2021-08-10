package com.G3Tingeso;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest{
    private static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/ingreso");
    }

    @Test
    public void pruebaIngreso(){
        driver.findElement(By.name("email")).sendKeys("a@a.a");
        driver.findElement(By.name("password")).sendKeys("a");
        driver.findElement(By.name("submit")).click();
        try{
            Thread.sleep(7000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.name("cerrar sesion")).click();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.name("iniciar sesion")).click();
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.name("email")).sendKeys("hola@hola.hola");
        driver.findElement(By.name("password")).sendKeys("jajs");
        driver.findElement(By.name("submit")).click();
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
