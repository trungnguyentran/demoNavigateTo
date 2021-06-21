import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSuite {
    WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
//        Run chromedriver
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("error" + e);
        }
    }

    @Test
    public void TC01_KiemTraLichSuTruyCap() {
        //tim vi tri nut input tim kiem cua Google
        String xPathInput = "//input[@name='q']";
        WebElement eleInput = driver.findElement(By.xpath(xPathInput));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("error" + e);
        }

        //dien euro 2021 va nhan Enter de Google tra ve ket qua tim kiem thong tin giai Euro 2021
        eleInput.sendKeys("euro 2021", Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("error" + e);
        }

        //tim vị trí link co thong tin chứa chuỗi: Lịch Euro 2021 hôm nay 21/06
        String xPathLink = "//h3[contains(text(), 'Lịch Euro 2021 hôm nay 21/06: ')]";
        WebElement eleLink = driver.findElement(By.xpath(xPathLink));
        //tre 3 giay de tim element Link
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("error" + e);
        }

        eleLink.click();

        //tre 3 giay de quay ve trang da truy cap truoc do
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("error" + e);
        }

        //quay ve trang da truy cap truoc do va doi 3 giay
        driver.navigate().back();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("error" + e);
        }

        //quay ve trang da truy cap truoc do va doi 3 giay
        driver.navigate().back();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("error" + e);
        }

        //tre 3 giay va truy cap trang ke tiep da truy cap
        driver.navigate().forward();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("error" + e);
        }

        //tre 3 giay va truy cap trang ke tiep da truy cap
        driver.navigate().forward();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("error" + e);
        }

        //tre 3 giay va truy cap trang ke tiep da truy cap
        driver.navigate().forward();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("error" + e);
        }
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
