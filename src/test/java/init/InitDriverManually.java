//package init;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
///**
// * Created by Hmayak Atayan on  29, Jan, 2021
// */
//public class InitDriverManually {
//    public static void main(String[] args) throws InterruptedException {
//        //todo version problem show
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver"); //todo .exe in windows
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.list.am/");
//
//        Thread.sleep(2000);
//        driver.findElement(By.id("menu")).click();
//    }
//}
