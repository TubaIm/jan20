/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author SK
 */
public class GoogleSearchTest {
    
    private WebDriver driver;
      
    public GoogleSearchTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
    //@Test
  public void testFacebook() throws Exception {
      driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("abc@abc.com");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("abc123");
    driver.findElement(By.name("login")).click(); 
    
    try {
        System.out.println("I am in");
      //assertEquals("Log Into Facebook", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create New Account'])[1]/following::span[3]")).getText());
    } catch (Error e) {
      fail(e.toString());
    } 
  }
  @Test
public void testCSS() throws InterruptedException {
driver = new ChromeDriver();
//Maximize browser window 
driver.manage().window().maximize();
driver.get("https://www.facebook.com/"); 
// Here Tag = input and Class = email 
driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Software Testing Material"); 
}
  
}
