package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Feminism extends BasePage {
  public Feminism(WebDriver driver) {
    super(driver);
  }

  //Methods
    public WebElement getCategoryTextFeminism(){
    return getDriver().findElement(By.cssSelector(".page-title")); }

    public List<WebElement> getAllPosts() {
    return until(ExpectedConditions.visibilityOfAllElementsLocatedBy
        (By.cssSelector(".post .entry-content")));
    }

    public WebElement getHrefFromPosts(WebElement post ) {
    return post.findElement(By.cssSelector(".post .entry-content"));
    }

    public List<WebElement> getAllEntryDates() {
    return until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector
        (".entry-date published updated")));
    }



  }
