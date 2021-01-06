package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Feminism extends BasePage {
  public Feminism(WebDriver driver) {
    super(driver);
  }
    //Site title and description methods
    public WebElement getSiteTitle(){
    return getDriver().findElement(By.cssSelector(".site-title")); }
    public WebElement getSiteDescription() {
    return getDriver().findElement(By.cssSelector(".site-description")); }

    public WebElement getCategoryTextFeminism(){
    return getDriver().findElement(By.cssSelector(".page-title")); }

  }
