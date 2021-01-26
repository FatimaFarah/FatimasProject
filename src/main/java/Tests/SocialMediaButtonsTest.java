package Tests;

import Pages.SocialMediaButtons;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class SocialMediaButtonsTest extends BaseIT {

  public SocialMediaButtons socialMediaButtons = new SocialMediaButtons(driver);

  @Before
  public void openURL() {
    getDriver().get("https://fatimaspeaks.com/");
  }

  @Test
  public void checkIfSocialMediaButtonsAreDisplayed() {
    socialMediaButtons.findAllTwitterButtons().forEach(WebElement::isDisplayed);
    socialMediaButtons.findAllFacebookButtons().forEach(WebElement::isDisplayed);
    socialMediaButtons.findAllLikeButtons().forEach(WebElement::isDisplayed);
  }

  @Test
  public void printLikeAmountsPerBlog() {
    socialMediaButtons.getLikeAmounts().forEach(WebElement::getText);
  }

  @Test
  public void clickTwitterButton() {
    socialMediaButtons.clickTwitterButton();
  }

  @Test
  public void clickFacebookButton() {
    socialMediaButtons.findAllFacebookButtons();
  }

}
