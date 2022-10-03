import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.*;
class HandleDriver {
    public static WebDriver driver = null;
    public static void setBrowser(String BrowserName) {
        System.out.println("Please Enter Browser Name !!");
        if(BrowserName.equalsIgnoreCase("Chrome")) {
            try {
                System.setProperty("webdriver.chrome.driver", "/Users/manoj.kumar1/IdeaProjects/SeleniumTest/chromedriver");
                driver = new ChromeDriver();
                System.out.println("Valid Browser Name !! Driver working !!");
            }catch(RuntimeException exception){
                System.out.println("Error while setting up a driver !!");
            }
        }
        else {
            System.out.println("Invalid Browser Name !! Please enter again !!");
            return;
        }
    }
    public static void defaultWaitImplicitly(){
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }catch(RuntimeException exception){
            System.out.println("Error while applying implicit wait !!");
        }
    }
    public static void openWebsite(){
        try {
            driver.get("https://unacademy.com/");
            driver.manage().window().maximize();
            System.out.println("Opened website successfully !!");
        }catch(RuntimeException exception){
            System.out.println("Unable to open this url !!");
        }
    }
    public static void switchToPreviousTab(){
        try{
            Set<String> windowsId = driver.getWindowHandles();
            Iterator<String> itr = windowsId.iterator();
            while(itr.hasNext()){
                String id = itr.next();
                if(driver.getTitle().equals("JEE Main and Advanced Preparation 2022 | Crack IIT JEE | Unacademy")){
                    driver.switchTo().window(id);
                    break;
                }
            }
            System.out.println("Switching to previous window done successfully !!");
        }catch(RuntimeException exception){
            System.out.println("Unable to switch tabs !!");
        }
    }
    public static void quitDriver(){
        try {
            driver.quit();
            System.out.println("Driver quit !!");
        }catch(RuntimeException exception){
            System.out.println("Unexpected error while quiting driver !!");
        }
    }
}
