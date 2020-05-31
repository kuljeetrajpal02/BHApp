package Resources;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static AppiumDriverLocalService service;
    public AppiumDriverLocalService startServer(){

        service= AppiumDriverLocalService.buildDefaultService();
        service.start();
        return service;
    }

    public static AndroidDriver <AndroidElement> driver;







    public static AndroidDriver <AndroidElement> capabilities(String appName) throws IOException {


        // app path
        System.out.println(System.getProperty("user.dir"));
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Resources/BA.properties");

        Properties prop = new Properties();
        prop.load(fis);
        File f = new File("src");
        File fs = new File(f, (String) prop.get(appName));

        AndroidDriver <AndroidElement> driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();

        //DeviceName
        String device = (String) prop.get("device");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);

        capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);


        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;

    }

       // public static void getScreenshot(String s) throws IOException {

       //File scrfile= driver.getScreenshotAs(OutputType.FILE);
         //   FileUtils.copyFile(scrfile, new File(System.getProperty("user.dir")+"\\"+s+".png"));

        }




