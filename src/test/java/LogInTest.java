import PageObject.HomePage;
import Utils.ChromeRunner;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;




public class LogInTest extends ChromeRunner {

    @Test
    public void LogInFunctionality() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.userName(useNameInput);
        home.password(passwordInput);
        home.press();
        home.closeXBtn();
        home.slotPage();


    }
}
