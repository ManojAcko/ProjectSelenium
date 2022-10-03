import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage{
    public static void startLearning(WebDriver driver){
        try {
            WebElement startLearning = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/section[1]/div[2]/div[1]/div[1]/section[1]/div[1]/a[1]/button[1]"));
            startLearning.click();
            System.out.println("startLeaning method called successfully !!");
        }catch(RuntimeException exception){
            System.out.println("Unable to find startLearning locator !!");
        }
    }
    public static void searchInput(WebDriver driver){
        try {
            WebElement searchOption = driver.findElement(By.id("searchInput"));
            searchOption.click();
            System.out.println("searchInput method called successfully !!");
        }catch(RuntimeException exception){
            System.out.println("Unable to find searchInput locator !!");
        }
    }
    public static void iitTabClick(WebDriver driver){
        try {
            WebElement iitTab = driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='manageGoal-page']/div[@id='search-wrapper']/div[1]/div[1]/div[2]/div[3]/div[1]"));
            iitTab.click();
            System.out.println("iitTabClick method called successfully !!");
        }catch(RuntimeException exception){
            System.out.println("Unable to find iitTabClick locator !!");
        }
    }
    public static void exploreTab(WebDriver driver){
        try{
            WebElement newTab = driver.findElement(By.linkText("Experience our 2021 recap"));
            newTab.click();
            System.out.println("exploreTab method called successfully !!");
        }catch(RuntimeException exception){
            System.out.println("Unable to find exploreTab locator !!");
        }
    }
    public static void clickGetSubscription(WebDriver driver){
        try{
            WebElement getSubscription = driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='preSubscribedBlocks']/div[1]/div[5]/button[1]"));
            getSubscription.click();
            System.out.println("clickGetSubscription method called successfully !!");
        }catch(RuntimeException exception){
            System.out.println("Unable to find clickGetSubscription locator !!");
        }
    }
}
