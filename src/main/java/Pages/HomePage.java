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

  public WebElement getSkipButton() {
    return getDriver().findElement(By.cssSelector(".skip-link"));
  }

  public WebElement getMenuHeader(){
    return findElementByCssSelector(".menu-custom-container");
  }

  //Menu bars
  public WebElement getFeminismSubheading() {
    return findElementByCssSelector("#menu-item-660 a");
  }

  public WebElement getBeautySubheading() {
    return findElementByCssSelector("#menu-item-539 a");
  }

  public WebElement getLifeStyleSubheading() {
    return findElementByCssSelector("#menu-item-541 a");
  }

  public WebElement getMentalHealthSubheading() {
    return findElementByCssSelector("#menu-item-540 a");
  }

  public WebElement getNerdySubheading() {
    return findElementByCssSelector("#menu-item-542 a");
  }

  public WebElement get2019Subheading() {
    return findElementByCssSelector("#menu-item-2652 a");
  }

  public WebElement getContactSubheading() {
    return findElementByCssSelector("#menu-item-103 a");
  }

  public void clickFeminismSubheading() {
    until(ExpectedConditions.elementToBeClickable(getFeminismSubheading())).click();
  }

  public void clickBeautySubHeading() {
    until(ExpectedConditions.elementToBeClickable(getBeautySubheading())).click();
    ;
  }

  public void clickLifeStyleSubHeading() {
    until(ExpectedConditions.elementToBeClickable(getLifeStyleSubheading())).click();
  }

  public void clickMentalHealthSubHeading() {
    until(ExpectedConditions.elementToBeClickable(getMentalHealthSubheading())).click();
  }

  public void clickNerdySubHeading() {
    until(ExpectedConditions.elementToBeClickable(getNerdySubheading())).click();
  }

  public void click2019SubHeading() {
    until(ExpectedConditions.elementToBeClickable(get2019Subheading())).click();
  }

  public void clickContactSubheading() {
    until(ExpectedConditions.elementToBeClickable(getContactSubheading())).click();
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

  public List<WebElement> getAllThumbnails() {
    return findAllElementsByCssSelector(".post-thumbnail");
  }

}


