/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author reach
 */
public class CarsTry {
    private WebDriver driver;
    private String baseUrl;
    
    public CarsTry() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
       
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // 
    // public void hello() {}
    
    @Test
    public void testCars() throws Exception {
    driver.get("https://www.cars.com/");
    driver.findElement(By.name("stockType")).click();
    new Select(driver.findElement(By.name("stockType"))).selectByVisibleText("New & Used Cars");
    driver.findElement(By.name("stockType")).click();
    driver.findElement(By.name("makeId")).click();
    new Select(driver.findElement(By.name("makeId"))).selectByVisibleText("Chrysler");
    driver.findElement(By.name("makeId")).click();
    driver.findElement(By.name("priceMax")).click();
    new Select(driver.findElement(By.name("priceMax"))).selectByVisibleText("No Max Price");
    driver.findElement(By.name("priceMax")).click();
    driver.findElement(By.name("radius")).click();
    new Select(driver.findElement(By.name("radius"))).selectByVisibleText("40 Miles from");
    driver.findElement(By.name("radius")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search by'])[2]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[7]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[8]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[9]/following::label[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"compareTray\"]/div[1]/button")).click();
    driver.findElement(By.xpath("//*[@id=\"compareTray\"]/div[2]/div[3]/button")).click();
   
    driver.findElement(By.linkText("Back to top")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Videos & Reviews'])[2]/following::a[1]")).click();
  }
}
