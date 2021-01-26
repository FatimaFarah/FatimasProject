package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SocialMediaButtons extends BasePage {
  public SocialMediaButtons(WebDriver driver) {
    super(driver);
  }

  public List<WebElement> findAllTwitterButtons() {
    return getDriver().findElements(By.cssSelector(".share-twitter"));
  }

  public List<WebElement> findAllFacebookButtons() {
    return getDriver().findElements(By.cssSelector(".share-facebook"));
  }

  public List<WebElement> findAllLikeButtons() {
    return getDriver().findElements(By.cssSelector(".wpl-button like"));
  }

  public List<WebElement> getLikeAmounts() {
    return getDriver().findElements(By.cssSelector(".wpl-count-text"));
  }

  //click social media buttons

  public void clickTwitterButton() {
    until(ExpectedConditions.elementToBeClickable(By.cssSelector(".share-twitter"))).click();
  }

  public void clickFacebookButtons() {
    until(ExpectedConditions.elementToBeClickable(By.cssSelector(".share-facebook"))).click();
  }
}
