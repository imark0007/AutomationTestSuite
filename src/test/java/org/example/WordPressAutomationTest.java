package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WordPressAutomationTest extends BrowserSetup {

    @Test
    public void testWordPressAutomation() {
        // 1. Log in to WordPress site
        browser.get("https://demo.wppool.dev/wp-dark-mode-slchbrwjg9kpvz6/wp-login.php?loggedout=true&wp_lang=en_US");
        WebElement usernameField = browser.findElement(By.id("user_login"));
        WebElement passwordField = browser.findElement(By.id("user_pass"));
        WebElement loginButton = browser.findElement(By.id("wp-submit"));
        usernameField.sendKeys("arkatalukder99@gmail.com");
        passwordField.sendKeys("ppyLktuSGYDs");
        loginButton.click();

        // 2. Check if WP Dark Mode Plugin is Active
        boolean isDarkModeActive = browser.findElement(By.cssSelector("div.plugin-card-top > div")).getText().contains("Active");
        if (!isDarkModeActive) {
            // 3. Install and Activate WP Dark Mode Plugin if not Active
            browser.get("https://demo.wppool.dev/wp-dark-mode-slchbrwjg9kpvz6/wp-admin/plugin-install.php?s=wp+dark+mode&tab=search&type=term");
            WebElement installNowButton = browser.findElement(By.cssSelector("button[data-slug='wp-dark-mode']"));
            installNowButton.click();
            WebElement activateButton = browser.findElement(By.cssSelector("button[data-slug='wp-dark-mode']"));
            activateButton.click();
        }

        // 4. Enable Backend Darkmode from General Settings
        browser.get("https://demo.wppool.dev/wp-dark-mode-slchbrwjg9kpvz6/wp-admin/options-general.php");
        WebElement enableDarkModeCheckbox = browser.findElement(By.id("wp-dark-mode-enable-backend"));
        enableDarkModeCheckbox.click();

        // 5. Validate Darkmode on Admin Dashboard
        boolean isDarkModeEnabled = browser.findElement(By.id("adminmenuwrap")).getAttribute("class").contains("dark-mode");
        Assert.assertTrue(isDarkModeEnabled, "Darkmode is not enabled on Admin Dashboard.");


        // 6. Navigate to WP Dark Mode
        browser.get("https://demo.wppool.dev/wp-dark-mode-slchbrwjg9kpvz6/wp-admin/options-general.php?page=wp-dark-mode-settings");

        //7 to 11 see the WordPressTestSuite.java

        // 12. Validate whether the Dark mode is working or not from the Frontend
        browser.get("https://demo.wppool.dev/wp-dark-mode-slchbrwjg9kpvz6/");
        boolean isFrontendDarkModeEnabled = browser.findElement(By.tagName("body")).getAttribute("class").contains("dark-mode");
        Assert.assertTrue(isFrontendDarkModeEnabled, "Darkmode is not enabled on Frontend.");
    }
}
