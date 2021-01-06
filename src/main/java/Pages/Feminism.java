package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Feminism extends BasePage {
  public Feminism(WebDriver driver) {
    super(driver);
  }
    public WebElement getCategoryTextFeminism(){
    return getDriver().findElement(By.cssSelector(".page-title")); }

  }
