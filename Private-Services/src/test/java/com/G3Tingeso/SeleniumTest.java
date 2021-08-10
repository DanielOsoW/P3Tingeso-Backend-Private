package com.G3Tingeso;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest{
    private static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8081/postulacion");
    }

    @Test
    public void pruebaPostulacion(){

        File file = new File("C://Users//death//OneDrive//Escritorio/matricula.pdf");
        String path = file.getAbsolutePath();

        //Datos Daniel.
        driver.findElement(By.name("diplomado")).click();
        driver.findElement(By.name("Ciencia de Datos Aplicada")).click();
        driver.findElement(By.name("nombre")).sendKeys("Daniel Felipe Osorio Weng");
        driver.findElement(By.name("correo")).sendKeys("daniel.osorio.w@usach.cl");
        driver.findElement(By.name("telefono")).sendKeys("76675216");
        driver.findElement(By.id("formFileMultiple")).sendKeys(path);
        driver.findElement(By.name("submit")).click();
        try{
            Thread.sleep(1000); 
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        String resultado = driver.findElement(By.name("resultado")).getAttribute("value");
        assertEquals(resultado, "Se ha creado la postulación con éxito");
        try{
            Thread.sleep(5000);
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