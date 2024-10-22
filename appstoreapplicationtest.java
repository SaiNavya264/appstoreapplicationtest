import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class appstoreapplicationtest {
    public static void main(String[]args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaappstore.ccbp.tech");
        WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Social']"));
        button.click();

        List<WebElement> products = driver.findElements(By.xpath("//ul[@class='apps-list']"));

        if (products.size() > 0) {
            System.out.println("Social apps count is correct");
        }else{
            System.out.println("Social apps count is incorrect");
        }

        WebElement button2=driver.findElement(By.xpath("//button[normalize-space()='Games']"));
        button2.click();

        List<WebElement> products2 = driver.findElements(By.xpath("//ul[@class='apps-list']"));

        if (products2.size() > 0) {
            System.out.println("Gaming apps count is correct");
        }else{
            System.out.println("Gaming apps count is incorrect");
        }

        WebElement button3=driver.findElement(By.xpath("(//button[normalize-space()='News'])[1]"));
        button3.click();
        List<WebElement>products3=driver.findElements(By.xpath("//ul[@class='apps-list']"));
        if(products3.size()>0){
            System.out.println("News apps count is correct");
        }else{
            System.out.println("News apps count is incorrect");
        }


        WebElement button4=driver.findElement(By.xpath("//button[normalize-space()='Food']"));
        button4.click();
        List<WebElement>products4=driver.findElements(By.xpath("//ul[@class='apps-list']"));
        if(products4.size()>0){
            System.out.println("Food apps count is correct");
        }else{
            System.out.println("Food apps count is incorrect");
        }

        WebElement news=driver.findElement(By.xpath("(//button[normalize-space()='News'])[1]"));
        news.click();
        WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        search.sendKeys("News");

        List<WebElement>news1=driver.findElements(By.xpath("//ul[@class='apps-list']"));
        if(news1.size()>0){
            System.out.println("News apps count is correct");
        }else{
            System.out.println("News apps count is incorrect");
        }

        driver.quit();












    }
}
