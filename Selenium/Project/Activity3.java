import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");

        String title = driver.findElement(By.xpath("(//h3[@class='uagb-ifb-title'])[1]")).getText();
        if (title.equals("Actionable Training")) {
            System.out.print("Text is correct "+title);
            driver.close();
        } else {
            System.out.print("Text is not correct");
        }
    }
}