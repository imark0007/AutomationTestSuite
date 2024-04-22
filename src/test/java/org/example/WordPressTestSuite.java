package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WordPressTestSuite extends BrowserSetup {

    @Test(priority = 1)
    public void step7To9() {
        // 7. Change Floating Switch Style
        // Navigate to the Switch Settings page
        browser.get("https://demo.wppool.dev/wp-dark-mode-slchbrwjg9kpvz6/wp-admin/admin.php?page=wp-dark-mode#/switch");

        // Select the Floating Switch Style dropdown and choose an option (e.g., 'Pill')
        WebElement switchStyleDropdown = browser.findElement(By.cssSelector("select[name='wpdm_float_switch_style']"));
        Select dropdown = new Select(switchStyleDropdown);
        dropdown.selectByVisibleText("Pill");

        // Save the settings
        WebElement saveButton = browser.findElement(By.cssSelector("button[name='wpdm_save_settings']"));
        saveButton.click();

        // 8. Select Custom Switch size & Scale it to 220
        // Navigate to the Switch Settings page
        browser.get("https://demo.wppool.dev/wp-dark-mode-slchbrwjg9kpvz6/wp-admin/admin.php?page=wp-dark-mode#/switch");

        // Enter the custom switch size (220) in the Switch Width field
        WebElement switchWidthField = browser.findElement(By.cssSelector("input[name='wpdm_float_switch_width']"));
        switchWidthField.clear();
        switchWidthField.sendKeys("220");

        // Enter the custom switch size (220) in the Switch Height field
        WebElement switchHeightField = browser.findElement(By.cssSelector("input[name='wpdm_float_switch_height']"));
        switchHeightField.clear();
        switchHeightField.sendKeys("220");

        // Save the settings
        saveButton.click();

        // 9. Change the Floating Switch Position (Left Bottom)
        // Navigate to the Switch Settings page
        browser.get("https://demo.wppool.dev/wp-dark-mode-slchbrwjg9kpvz6/wp-admin/admin.php?page=wp-dark-mode#/switch");

        // Select the Floating Switch Position dropdown and choose 'Left Bottom'
        WebElement switchPositionDropdown = browser.findElement(By.cssSelector("select[name='wpdm_float_switch_position']"));
        Select positionDropdown = new Select(switchPositionDropdown);
        positionDropdown.selectByVisibleText("Left Bottom");

        // Save the settings
        saveButton.click();
    }

    @Test(priority = 2)
    public void step10() {
        // 10. Disable Keyboard Shortcut from the Accessibility Settings
        // Navigate to the Accessibility Settings page
        browser.get("https://demo.wppool.dev/wp-dark-mode-slchbrwjg9kpvz6/wp-admin/admin.php?page=wp-dark-mode#/accessibility");

        // Uncheck the Keyboard Shortcut option
        WebElement keyboardShortcutCheckbox = browser.findElement(By.cssSelector("input[name='wpdm_enable_shortcut']"));
        if (keyboardShortcutCheckbox.isSelected()) {
            keyboardShortcutCheckbox.click();
        }

        // Save the settings
        WebElement saveButton = browser.findElement(By.cssSelector("button[name='wpdm_save_settings']"));
        saveButton.click();
    }
        @Test(priority = 3)
        public void step11() {
            // 11. Enable Darkmode Toggle Animation & change the Animation Effect
            // Navigate to the Animation Settings page
            browser.get("https://demo.wppool.dev/wp-dark-mode-slchbrwjg9kpvz6/wp-admin/admin.php?page=wp-dark-mode#/animation");

            // Enable Darkmode Toggle Animation
            WebElement toggleAnimationCheckbox = browser.findElement(By.cssSelector("input[name='wpdm_enable_animation']"));
            if (!toggleAnimationCheckbox.isSelected()) {
                toggleAnimationCheckbox.click();
            }

            // Select Animation Effect dropdown and choose an option (e.g., 'Fade')
            WebElement animationEffectDropdown = browser.findElement(By.cssSelector("select[name='wpdm_animation_effect']"));
            Select dropdown = new Select(animationEffectDropdown);
            dropdown.selectByVisibleText("Fade");

            // Save the settings
            WebElement saveButton = browser.findElement(By.cssSelector("button[name='wpdm_save_settings']"));
            saveButton.click();
        }
    }

