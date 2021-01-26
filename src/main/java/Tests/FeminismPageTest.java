package Tests;

import Pages.Feminism;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FeminismPageTest extends BaseIT {
  public Feminism feminism = new Feminism(driver);

  @Before
  public void openURL() {
    getDriver().get("https://fatimaspeaks.com/category/feminism/");
  }

  @Test
  public void IsCategoryTextDisplayed() {
    assertNotNull(feminism.getCategoryTextFeminism().isDisplayed());
    System.out.println(feminism.getCategoryTextFeminism().getText());
  }

  @Test
  public void continueReadingTests() {
    assertTrue(feminism.getContinueReadingLink().isDisplayed());
    assertNotNull(feminism.getContinueReadingLink().getAttribute("href"));
    feminism.getContinueReadingLink().getText();
  }

  @Test
  public void clickContinueReading() {
    feminism.clickContinueReadingLink();
    Assert.assertTrue("Website did not navigate to continue reading link",
        getCurrentURL().contains("/2020/06/12/i-am-sick-of-debating-my-existence/"));
  }
}
