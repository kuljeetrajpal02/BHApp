package pageObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    public FormPage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.leanagri.leannutri:id/fls_english_item")
    public WebElement fls_english_item;

    @AndroidFindBy(id = "com.leanagri.leannutri:id/dial_nine")
    public WebElement dial_nine;

    @AndroidFindBy(id = "com.leanagri.leannutri:id/dial_five")
    public WebElement dial_five;

    @AndroidFindBy(id = "com.leanagri.leannutri:id/dial_two")
    public WebElement dial_two;

    @AndroidFindBy(id = "com.leanagri.leannutri:id/dial_seven")
    public WebElement dial_seven;

    @AndroidFindBy(id = "com.leanagri.leannutri:id/dial_one")
    public WebElement dial_one;

    @AndroidFindBy(id = "com.leanagri.leannutri:id/dial_four")
    public WebElement dial_four;

    @AndroidFindBy(id = "com.leanagri.leannutri:id/btn_proceed")
    public WebElement btn_proceed;

    //@AndroidFindBy(id = "com.leanagri.leannutri:id/btn_verify_otp")
    //public WebElement btn_verify_otp;
}
