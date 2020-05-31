import Resources.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObject.FormPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Login extends Base {


    @Test
    public void selectLanguage() throws IOException {

        service= startServer();

        AndroidDriver <AndroidElement> driver = capabilities("GeneralStoreApp");
        FormPage formPage = new FormPage(driver);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //w.until(ExpectedConditions.presenceOfElementLocated(By.id("com.leanagri.leannutri:id/fls_english_item")));

        formPage.fls_english_item.click();
        System.out.println("Selected Language Success");



        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.leanagri.leannutri:id/phoneNumberText")));



            formPage.dial_nine.click();
            formPage.dial_five.click();
            formPage.dial_two.click();
            formPage.dial_seven.click();
            formPage.dial_two.click();
            formPage.dial_four.click();
            formPage.dial_one.click();
            formPage.dial_four.click();
            formPage.dial_four.click();
            formPage.dial_seven.click();
            System.out.println("Dialed Number Success");


            formPage.btn_proceed.click();
            System.out.println("kuljeet");


            //formPage.btn_verify_otp.click();
            System.out.println("Login Success Yooo!!");

            service.stop();




            //Scroll code
            //Utilities u = new Utilities(driver);
            //driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector().scrollIntoView(text(\"Enter name of Text\"));");
            //u.scrollToText("Enter till where you want to scroll/ text");

        }
    }





