import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class FormSubmissionSteps {

    WebDriver driver;

    @Given("I am on the form submission page")
    public void iAmOnTheFormSubmissionPage() {
        // Set up the ChromeDriver and navigate to the form page
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/forms");
    }

    @When("I fill in the form with valid data")
    public void iFillInTheFormWithValidData() {
        // Locate form elements and fill them with valid data
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("userEmail")).sendKeys("johndoe@example.com");
        driver.findElement(By.cssSelector("input[value='Male']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");

        // Handle other form elements like date pickers, checkboxes, etc. if needed
        // Assuming basic text input and selection are done
    }

    @And("I click the submit button")
    public void iClickTheSubmitButton() {
        // Click the submit button
        driver.findElement(By.id("submit")).click();
    }

    @Then("I should see a success message indicating the form was submitted")
    public void iShouldSeeASuccessMessageIndicatingTheFormWasSubmitted() {
        // Verify that a success message is displayed
        WebElement successMessage = driver.findElement(By.className("success-message-class"));
        Assert.assertTrue("Form submission failed!", successMessage.isDisplayed());

        // Close the browser after the test
        driver.quit();
    }
}