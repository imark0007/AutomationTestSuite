# Automation Test Suite for WordPress

This repository contains an automation test suite implemented in Java using Selenium WebDriver for testing various scenarios on a WordPress site.

## Requirements
- Java Development Kit (JDK)
- IntelliJ IDEA or any preferred Java IDE
- Selenium WebDriver library
- Chrome browser
- IntelliJ IDEA Driver executable

## Test Suite Execution Steps

1. **Clone the Project**: Clone or download the project repository to your local machine.

2. **Import Project into IntelliJ IDEA**: Open IntelliJ IDEA and import the project.

3. **Set Up WebDriver**: Ensure that the ChromeDriver executable path is correctly configured in the `BrowserSetup` class.

4. **Update WordPress Credentials**: Replace the provided WordPress login credentials (`username` and `password`) with your own in the test suite code.

5. **Review Scenarios**: Review the scenarios outlined in the test suite code to ensure they match the desired test steps.

6. **Run the Test Suite**:
   - Right-click on the test suite class (`WordPressTestSuite.java`).
   - Select "Run WordPressTestSuite".

7. **Monitor Test Execution**: Watch the test execution in the IntelliJ IDEA console. Any failures or errors encountered during the test execution will be displayed here.

8. **Verify Results**: After the test suite execution is complete, verify the test results by reviewing the console output and any generated reports or logs.

9. **Troubleshooting**: If any errors occur during the test execution, review the code and error messages to identify and resolve any issues. Ensure that the WebDriver setup is correct and that the WordPress site is accessible.

10. **Repeat Test Execution**: You can repeat the test execution as needed by re-running the test suite from IntelliJ IDEA.

11. **Clean Up**: After completing the test execution, ensure to close the browser and clean up any temporary files or resources used during testing.

By following these steps, you can effectively run the automation test suite for the WordPress scenarios and validate the behavior of the WordPress site based on the provided test cases.
