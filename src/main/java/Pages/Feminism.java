package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Feminism extends BasePage {
  public Feminism(WebDriver driver) {
    super(driver);
  }

  //Methods
  public WebElement getCategoryTextFeminism() {
    return findElementByCssSelector(".page-title");
  }

  public List<WebElement> getAllPosts() {
    return findAllElementsByCssSelector(".post .entry-content a");
  }

  public WebElement getAllPosts(WebElement post) {
    return post.findElement(By.cssSelector(".post .entry-content"));
  }

  public WebElement getContinueReadingLink() {
    return findElementByCssSelector(".more-link");
  }

  public List<WebElement> getAllEntryDates() {
    return findAllElementsByCssSelector(".entry-date published updated");
  }


}
