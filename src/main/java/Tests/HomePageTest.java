package Tests;

import Pages.Feminism;
import Pages.HomePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HomePageTest extends BaseIT {

  public HomePage homePage = new HomePage(driver);
  public Feminism feminism = new Feminism(driver);


  @Before
  public void openURL() {
    getDriver().get("https://fatimaspeaks.com/");
  }

  @Test
  public void checkIfPageTitleIsDisplayed() {
    System.out.println(homePage.checkIfPageTitleIsDisplayed());
  }

  @Test
  public void checkIfPageSubtitleIsDisplayed() {
    assertTrue(homePage.checkIfPageSubheadingIsDisplayed());
  }

  @Test
  public void clickFeminismMenuTab() {
    homePage.clickFeminismSubheading();
    assertTrue("Website did not navigate to subheading",
        getCurrentURL().contains("/category/feminism/"));
  }

  @Test
  public void getMenuTabText() {
    assertNotNull(homePage.getFeminismSubheading().getText());
    assertNotNull(homePage.getBeautySubheading().getText());
    assertNotNull(homePage.getLifeStyleSubheading().getText());
    assertNotNull(homePage.getMentalHealthSubheading().getText());
    assertNotNull(homePage.getLifeStyleSubheading().getText());
    assertNotNull(homePage.get2019Subheading().getText());
    assertNotNull(homePage.getContactSubheading().getText());

  }

  @Test
  public void getMenuTabLinks() {
    assertNotNull(homePage.getFeminismSubheading().getAttribute("href"));
    assertNotNull(homePage.getBeautySubheading().getAttribute("href"));
    assertNotNull(homePage.getLifeStyleSubheading().getAttribute("href"));
    assertNotNull(homePage.getMentalHealthSubheading().getAttribute("href"));
    assertNotNull(homePage.getNerdySubheading().getAttribute("href"));
    assertNotNull(homePage.get2019Subheading().getAttribute("href"));
    assertNotNull(homePage.getContactSubheading().getAttribute("href"));

  }

  @Test
  public void getMenuTabsTextLambda() {
    homePage.getSubHeadings().forEach(heading -> assertNotNull(heading.getText()));
  }

  @Test
  public void getMenuTabsLinksLambda() {
    homePage.getSubHeadings().forEach(heading -> assertNotNull(heading.getAttribute("href")));
  }

  @Test
  public void getMenuTabsLambdaCombined() {
    homePage.getSubHeadings().forEach(heading -> {
      assertNotNull(heading.getText());
      assertNotNull(heading.getAttribute("href"));
    });
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
