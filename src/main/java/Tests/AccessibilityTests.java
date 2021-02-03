package Tests;

import Pages.HomePage;
import Pages.SocialMediaButtons;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static org.junit.Assert.*;


public class AccessibilityTests extends BaseIT {
  public HomePage homePage = new HomePage(driver);
  public SocialMediaButtons socialMediaButtons = new SocialMediaButtons(driver);

  @Before
  public void openURL() {
    getDriver().get("https://fatimaspeaks.com/");
  }

  @Test
  public void keyboardTabbingMenuHeader() {
    homePage.getFeminismSubheading().sendKeys(Keys.TAB);
    homePage.getBeautySubheading().sendKeys(Keys.TAB);
    homePage.getLifeStyleSubheading().sendKeys(Keys.TAB);
    homePage.getMentalHealthSubheading().sendKeys(Keys.TAB);
    homePage.getNerdySubheading().sendKeys(Keys.TAB);
    homePage.get2019Subheading().sendKeys(Keys.TAB);
    homePage.getContactSubheading().sendKeys(Keys.TAB);
  }

  @Test
  public void socialMediaButtons() { // no aria labels on the blog :(
    socialMediaButtons.findAllFacebookButtons().forEach(button ->
        assertNull(button.getAttribute("aria")));
    socialMediaButtons.findAllTwitterButtons().forEach(button ->
        assertNull(button.getAttribute("aria")));
    socialMediaButtons.findAllLikeButtons().forEach(button ->
        assertNull(button.getAttribute("aria")));
  }

  @Test
  public void imageAltTags() { //no alt tags on blog
    homePage.getAllThumbnails().forEach(image -> assertNull(image.getAttribute("alt")));
  }

}

