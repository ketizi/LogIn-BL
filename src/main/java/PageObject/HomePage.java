package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    public static WebElement Betlive;
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    By usernameBtn = By.xpath("//*[@id=\"main-username\"]");
    By passwordBtn = By.id("main-password");
    By pressBtn = By.xpath("/html/body/app-website-root/app-website-container/div/div[1]/app-website-header/div/div[3]/div[1]/form/div/div[3]/ui-button");
    By slotPage = By.xpath("/html/body/app-website-root/app-website-container/div/div[1]/app-website-header/div/div[2]/a[3]/div");
    By closeBtn = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-website-request-modal/div/div[1]/div[2]");

    public void userName(String useNameInput) throws InterruptedException {
        driver.findElement(usernameBtn).sendKeys(useNameInput);
        Thread.sleep(2000);
    }

    public void password(String passwordInput) {
        int timeoutInSeconds = 10;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(passwordBtn));
        driver.findElement(passwordBtn).sendKeys(passwordInput);
    }

    public void press() throws InterruptedException {
        driver.findElement(pressBtn).click();
        Thread.sleep(2000);
    }

    public void closeXBtn(){
        driver.findElement(closeBtn).click();
    }

    public void slotPage() throws InterruptedException {
        driver.findElement(slotPage).click();
        Thread.sleep(2000);
    }

}
