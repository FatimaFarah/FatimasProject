package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage {

  public HomePage(WebDriver driver) {
    super(driver);
  }

  //Page Title
  public WebElement getPageTitle(){
    return getDriver().findElement(By.cssSelector(".site-title"));
  }
  public boolean checkIfPageTitleIsDisplayed() {
    return getPageTitle().isDisplayed();
  }
//Page Subtitle
  public WebElement getSubheading() {
    return getDriver().findElement(By.cssSelector(".site-description"));
  }
  public boolean checkIfPageSubheadingIsDisplayed() {
    return getSubheading().isDisplayed();
  }
//Menu bars
  public WebElement getFeminismSubheading() {
    return getDriver().findElement(By.cssSelector("#menu-item-660"));
  }
  public WebElement getBeautySubheading(){
    return findElementByCssSelector("#menu-item-539");
  }
  public WebElement getLifeStyleSubheading(){
    return getDriver().findElement(By.cssSelector("#menu-item-541"));
  }
  public WebElement getMentalHealthSubheading(){
    return getDriver().findElement(By.cssSelector("#menu-item-540"));
  }
  public WebElement getNerdySubheading(){
    return getDriver().findElement(By.cssSelector("#menu-item-542"));
  }
  public WebElement get2019Subheading(){
    return getDriver().findElement(By.cssSelector("#menu-item-2652"));
  }
  public WebElement getContactSubheading(){
    return getDriver().findElement(By.cssSelector("#menu-item-103"));
  }


  public List<WebElement> getSubHeadings() {
    return findElementsByCssSelector(Arrays.asList("#menu-item-541", "#menu-item-540"));
  }

  private List<WebElement> findElementsByCssSelector(List<String> selectors) {
    return selectors.stream()
      .map(this::findElementByCssSelector)
      .collect(Collectors.toList());
  }

  private WebElement findElementByCssSelector(String selector) {
    return getDriver().findElement(By.cssSelector(selector));
  }
}
