package homeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement createAccount = driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Will");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Acevedo");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("WillAce123@gmail.com");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("abracadabra");

    }
}
