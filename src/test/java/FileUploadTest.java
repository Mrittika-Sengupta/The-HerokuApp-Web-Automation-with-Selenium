import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;

public class FileUploadTest extends BaseTest {
    private final By FILE_UPLOAD_LINK = By.linkText("File Upload");
    private final By CHOOSE_FILE_BUTTON = By.id("file-upload");
    private final By UPLOAD_BUTTON = By.id("file-submit");
    private final By UPLOADED_FILE = By.id("uploaded-files");
    private final String FILE_NAME = "LambdaTest.txt";
    private final String FILE_PATH = System.getProperty("user.dir") + RELATIVE_RESOURCE_PATH + FILE_NAME;




    @Test
    public void fileUploadTest() {
        driver.findElement(FILE_UPLOAD_LINK).click();

        // Uploading the file
        File fileToUpload = new File(FILE_PATH);
        driver.findElement(CHOOSE_FILE_BUTTON).sendKeys(fileToUpload.getAbsolutePath());
        driver.findElement(UPLOAD_BUTTON).click();

        // Verifying uploaded file
        WebElement uploadedFileElement = driver.findElement(UPLOADED_FILE);
        Assert.assertEquals(uploadedFileElement.getText(), FILE_NAME, "File name is incorrect or missing");
    }
}
