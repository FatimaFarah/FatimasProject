package Tests;

import Pages.MyBlogPage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyBlogTest extends BaseIT{

  public MyBlogPage myBlogPage;

  @Before
  public void openURL() {
    getDriver().get("https://fatimaspeaks.com/");
  }

  @Test
  public void checkIfPageTitleIsDisplayed() {
    assertTrue(myBlogPage.checkIfPageTitleIsDisplayed());
  }

  @Test
  public void checkIfPageSubtitleIsDisplayed(){
    assertTrue(myBlogPage.checkIfPageSubheadingIsDisplayed());
  }

  @Test
  public void clickFeminismMenuTab() {
    myBlogPage.clickFeminismTab();
  }

}
