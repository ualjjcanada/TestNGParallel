import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class LocalDriverFactory {
    static WebDriver createInstance (String browserName) {
        WebDriver driver = null;
        if (browserName.toLowerCase().contains("firefox")) {
        	// Descargar Firefox driver (Gecko Driver) de https://github.com/mozilla/geckodriver/releases y copiar en carpeta drivers
        	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver-v0.24.0-win64/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return driver;
        }
        if (browserName.toLowerCase().contains("chrome")) {
        	// Descargar Chrome driver de https://sites.google.com/a/chromium.org/chromedriver/downloads y copiar en carpeta drivers
        	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return driver;
        }
        return driver;
    }
}