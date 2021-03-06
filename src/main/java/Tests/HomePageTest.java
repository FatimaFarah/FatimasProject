package Tests;

import Pages.HomePage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HomePageTest extends BaseIT {

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
  public void clickBeautyMenuTab() {
    homePage.clickBeautySubHeading();
    assertTrue("Website did not navigate to subheading",
        getCurrentURL().contains("/category/beauty/"));
  }

  @Test
  public void clickLifeStyleMenuTab() {
    homePage.clickLifeStyleSubHeading();
    assertTrue("Website did not navigate to subheading",
        getCurrentURL().contains("/category/lifestyle/"));
  }

  @Test
  public void clickMentalHealthMenuTab() {
    homePage.clickMentalHealthSubHeading();
    assertTrue("Website did not navigate to subheading",
        getCurrentURL().contains("/category/mental-health/"));
  }

  @Test
  public void clickNerdyMenuTab() {
    homePage.clickNerdySubHeading();
    assertTrue("Website did not navigate to subheading",
        getCurrentURL().contains("/category/nerdy/"));
  }

  @Test
  public void click2019MenuTab() {
    homePage.click2019SubHeading();
    assertTrue("Website did not navigate to subheading",
        getCurrentURL().contains("/category/2019-challenge/"));
  }

  @Test
  public void clickContactMenuTab() {
    homePage.clickContactSubheading();
    assertTrue("Website did not navigate to subheading",
        getCurrentURL().contains("/contact/"));
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

}
