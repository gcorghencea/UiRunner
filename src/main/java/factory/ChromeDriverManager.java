package factory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class ChromeDriverManager extends DriverManager {

    private ChromeDriverService chService;

    public void startService() {
        if(null == chService){
            try{
                chService = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File("drivers/chromedriver.exe"))
                        .usingAnyFreePort()
                        .build();
                chService.start();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void stopService() {
        if(null != chService && chService.isRunning())
            chService.stop();
    }

    public void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        capabilities.setCapability(ChromeOptions.CAPABILITY,options);
        driver = new ChromeDriver(chService);
    }
}
