package Tests;

import Pages.MyBlogPage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyBlogTest extends BaseIT{

  public MyBlogPage myBlogPage = new MyBlogPage(driver);


  @Before
  public void openURL() {
    getDriver().get("https://fatimaspeaks.com/");
  }

  @Test
  public void checkIfPageTitleIsDisplayed() {
    System.out.println(myBlogPage.checkIfPageTitleIsDisplayed());
  }

  @Test
  public void checkIfPageSubtitleIsDisplayed(){
    assertTrue(myBlogPage.checkIfPageSubheadingIsDisplayed());
  }

  @Test
  public void clickFeminismMenuTab() {
    myBlogPage.getFeminismSubheading().click();
  }

  @Test
  public void getMenuTabText() {
    System.out.println(myBlogPage.getFeminismSubheading().getText());
    System.out.println(myBlogPage.getBeautySubheading().getText());
    System.out.println(myBlogPage.getLifeStyleSubheading().getText());
    System.out.println(myBlogPage.getMentalHealthSubheading().getText());
    System.out.println(myBlogPage.getNerdySubheading().getText());
    System.out.println(myBlogPage.get2019Subheading().getText());
    System.out.println(myBlogPage.getContactSubheading().getText());
  }

  @Test
  public void printText() {
    System.out.println(myBlogPage.getPageTitle().getText());
    System.out.println(myBlogPage.getSubheading().getText());
  }

}
