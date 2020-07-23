package Tests;

import Pages.HomePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class HomePageTest extends BaseIT{

  public HomePage homePage = new HomePage(driver);


  @Before
  public void openURL() {
    getDriver().get("https://fatimaspeaks.com/");
  }

  @Test
  public void checkIfPageTitleIsDisplayed() {
    System.out.println(homePage.checkIfPageTitleIsDisplayed());
  }

  @Test
  public void checkIfPageSubtitleIsDisplayed(){
    assertTrue(homePage.checkIfPageSubheadingIsDisplayed());
  }

  @Test
  public void clickFeminismMenuTab() {
    actions(homePage.getFeminismSubheading()).click();
  }

  @Test
  public void getMenuTabText() {
    System.out.println(homePage.getFeminismSubheading().getText());
    System.out.println(homePage.getBeautySubheading().getText());
    System.out.println(homePage.getLifeStyleSubheading().getText());
    System.out.println(homePage.getMentalHealthSubheading().getText());
    System.out.println(homePage.getNerdySubheading().getText());
    System.out.println(homePage.get2019Subheading().getText());
    System.out.println(homePage.getContactSubheading().getText());
  }

  @Test
  public void getMenuTabsText() {
    homePage.getSubHeadings().forEach(heading -> System.out.println(heading.getText()));
  }

  @Test
  public void printHeadingAndSubheading() {
    System.out.println(homePage.getPageTitle().getText());
    System.out.println(homePage.getSubheading().getText());
  }

  @Test
  public void checkIfSocialMediaButtonsAreDisplayed() {
    homePage.findAllTwitterButtons().forEach(WebElement::isDisplayed);
    homePage.findAllFacebookButtons().forEach(WebElement::isDisplayed);
    homePage.findAllLikeButtons().forEach(WebElement::isDisplayed);
  }

  @Test
  public void printLikeAmountsPerBlog() {
  homePage.getLikeAmounts().forEach(WebElement::getText);

  }


}
