package Tests;

import Pages.Feminism;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FeminismPageTest extends BaseIT{
  public Feminism feminism = new Feminism(driver);

  @Before
  public void openURL() {
    getDriver().get("https://fatimaspeaks.com/category/feminism/");
  }

  @Test
  public void printCategoryTest(){
    System.out.println(feminism.getCategoryTextFeminism().getText());
  }

  @Test
  public void areHrefsDisplayed() {
    feminism.getAllPosts().forEach(post -> {
      assertNotNull(feminism.getHrefFromPosts(post).getAttribute("href"));
    });
  }
}
