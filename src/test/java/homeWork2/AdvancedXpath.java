package homeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");

//fave-book1
        WebElement faveBook1= driver.findElement(By.xpath("//input[@id='favourite-book']"));
        faveBook1.sendKeys("True to the game");

//following sibling, fave-book2
        WebElement faveBook2= driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        faveBook2.sendKeys("Art of War");

//following sibling, fave-book3
        WebElement faveBook3= driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        faveBook3.sendKeys("Java for Dummies");

//preceding sibling, 1st box
        WebElement reverseFave1= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        reverseFave1.sendKeys("Java for Dummies");

//2nd box
        WebElement reverseFave2= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        reverseFave2.sendKeys("Art of War");

//3rd box
        WebElement reverseFave3= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        reverseFave3.sendKeys("True to the game");

//Parent Child Rel, box 1
        WebElement grParent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grParent.sendKeys("GrandParent");

//box 2
        WebElement parent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Parent");

//box 3
        WebElement child= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Child");

    }
}
