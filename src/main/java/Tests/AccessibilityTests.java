package Tests;

import Pages.HomePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Pages.BasePage.keyboardTabbingSequence;

public class AccessibilityTests extends BaseIT {
  public HomePage homePage = new HomePage(driver);

  @Before
  public void openURL() {
    getDriver().get("https://fatimaspeaks.com/");
  }

  @Test
  public void menuTabKeyboardTabbing() {
    keyboardTabbing();
  }

  public void keyboardTabbing() {
    WebElement element1 = homePage.getFeminismSubheading();
    WebElement element2 = homePage.getBeautySubheading();
    WebElement element3 = homePage.getLifeStyleSubheading();
    WebElement element4 = homePage.getMentalHealthSubheading();
    WebElement element5 = homePage.getNerdySubheading();
    WebElement element6 = homePage.get2019Subheading();
    WebElement element7 = homePage.getContactSubheading();

    List<WebElement> tabOrder = new ArrayList<>(Arrays.asList(
        element1,
        element2,
        element3,
        element4,
        element5,
        element6,
        element7
    ));

    keyboardTabbingSequence(homePage.getMenuHeader(), tabOrder); //keeps clicking nerdy tab :(
  }
}

