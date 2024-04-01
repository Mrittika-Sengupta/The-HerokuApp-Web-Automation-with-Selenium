
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTableTests extends BaseTest {
    private final By SORTABLE_DATA_TABLES = By.xpath(String.format(PRECISE_TEXT_XPATH, "Sortable Data Tables"));//here it finds sortable data table by xpath
    private final By DUE_ELEMENTS_LOCATOR = By.xpath("//*[@id='table1']//td[4]");
    private final Double EXPECTED_SUM = 251.0; // total sums of the data values
    private final String CURRENCY_REGEX = "[^\\d.]"; // it removes all the symbol

    @Test
    public void dataTableTest() {
        driver.findElement(SORTABLE_DATA_TABLES).click(); // go to the page of the Sortable data tables
        List<WebElement>duelist = driver.findElements(DUE_ELEMENTS_LOCATOR); //for getting all the available value(elements) from the table
        Double actualSum = 0.0 ; // store the sum
        for (WebElement element: duelist){ //running loop
            String elementText = element.getText();
            actualSum +=Double.parseDouble(elementText.replaceAll(CURRENCY_REGEX, ""));
        }
        Assert.assertEquals(actualSum, EXPECTED_SUM, "Sum is not correct");
    }
}
