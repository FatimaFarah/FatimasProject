package Tests;

import Pages.Feminism;
import org.junit.Before;
import org.junit.Test;

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
}
