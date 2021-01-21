package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage {

  public HomePage(WebDriver driver) {
    super(driver);
  }

  //Page Title
  public WebElement getPageTitle() {
    return findElementByCssSelector(".site-title");
  }

  public boolean checkIfPageTitleIsDisplayed() {
    return getPageTitle().isDisplayed();
  }

  //Page Subtitle
  public WebElement getSubheading() {
    return findElementByCssSelector(".site-description");
  }

  public boolean checkIfPageSubheadingIsDisplayed() {
    return getSubheading().isDisplayed();
  }

  //Menu bars
  public WebElement getFeminismSubheading() {
    return findElementByCssSelector("#menu-item-660 a");
  }

  public void clickFeminismSubheading() {
    until(ExpectedConditions.elementToBeClickable(getFeminismSubheading())).click();
  }

  public WebElement getBeautySubheading() {
    return findElementByCssSelector("#menu-item-539");
  }

  public WebElement getLifeStyleSubheading() {
    return findElementByCssSelector("#menu-item-541");
  }

  public WebElement getMentalHealthSubheading() {
    return findElementByCssSelector("#menu-item-540");
  }

  public WebElement getNerdySubheading() {
    return findElementByCssSelector("#menu-item-542");
  }

  public WebElement get2019Subheading() {
    return findElementByCssSelector("#menu-item-2652");
  }

  public WebElement getContactSubheading() {
    return findElementByCssSelector("#menu-item-103");
  }


  public List<WebElement> getSubHeadings() {
    return findAllElementsByCssSelector(".menu-item a");
  }

  private List<WebElement> findElementsByCssSelector(List<String> selectors) {
    return selectors.stream()
        .map(this::findElementByCssSelector)
        .collect(Collectors.toList());
  }

  public WebElement getSharingSelector() {
    return until(ExpectedConditions.presenceOfElementLocated
        (By.cssSelector("#sharedaddy sd-sharing-enabled")));

  }

  //social media buttons
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

}


