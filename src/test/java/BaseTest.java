
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.nio.file.Paths;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected final String URL = "https://the-internet.herokuapp.com/";
    protected final String PRECISE_TEXT_XPATH = "//*[text()='%s']";
    protected final String PARTICULAR_TEXT_XPATH = "//*[contains(text(),'%s')]";
    protected final String RELATIVE_RESOURCE_PATH = "/src/test/resources/";
    protected WebDriverWait wait = null;
    protected static final int MAX_WAIT = 30;
    private String downloadDirectory;

    @BeforeMethod
    public void setup() {

        downloadDirectory = getFullPath(RELATIVE_RESOURCE_PATH);
        // Set up ChromeOptions
        ChromeOptions chromeOptions = new ChromeOptions();
        java.util.Map<String, Object> prefs = new java.util.HashMap<>();
        prefs.put("download.default_directory", downloadDirectory);
        chromeOptions.setExperimentalOption("prefs", prefs);
        chromeOptions.addArguments("download.default_directory=" + RELATIVE_RESOURCE_PATH);
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_WAIT));
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
    protected String getFullPath(String relativePath) {
        String projectRoot = System.getProperty("user.dir");
        return Paths.get(projectRoot, relativePath).toString();
    }
}