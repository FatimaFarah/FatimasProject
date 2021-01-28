package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BasePage {
  private static WebDriver driver;
  private static WebDriverWait wait;

  private static final int TIMEOUT = 30;
  private static final int POLLING = 100;

  public BasePage(WebDriver driver) {
    this.driver = driver;

    // Implicit Wait
    driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
    // Explicit Wait
    wait = new WebDriverWait(driver, TIMEOUT, POLLING);

    PageFactory.initElements(driver, this);
  }

  protected static WebDriver getDriver() {
    return driver;
  }

  protected static <V> V until(Function<? super WebDriver, V> isTrue) {
    return wait.until(isTrue);
  }

  protected <V> V until(Function<? super WebDriver, V> isTrue, String messageToPrintOnFailure) {
    return wait.withMessage(messageToPrintOnFailure).until(isTrue);
  }

  protected void waitForElementToAppear(By locator) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  }

  protected void waitForElementToDisappear(By locator) {
    wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
  }

  protected void waitForTextToDisappear(By locator, String text) {
    wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
  }

  protected void waitForUrlToBe(String url) {
    wait.until(ExpectedConditions.urlToBe(url));
  }

  protected Actions actions() {
    return new Actions(getDriver());
  }

  protected void threadSleep(int sleepTime) {
    try {
      Thread.sleep(sleepTime);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  protected WebElement findElementByCssSelector(String selector) {
    return until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
  }
  protected List<WebElement> findAllElementsByCssSelector(String selector) {
    return until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(selector)));
  }
  protected static ExpectedCondition<Boolean> focusOnElement(WebElement element) {
    return new ExpectedCondition<Boolean>() {

      @Override
      public Boolean apply(WebDriver driver) {
        return element.equals(driver.switchTo().activeElement());
      }

      @Override
      public String toString() {
        return "element to be focused: " + element;
      }
    };
  }

  public static void keyboardTabbingSequence(WebElement focusOnFirst, List<WebElement> elements) {
    focusOnFirst.click();
    for (WebElement element : elements) {
      getDriver().switchTo().activeElement().sendKeys(Keys.TAB);
      until(focusOnElement(element));
    }
  }
  }

