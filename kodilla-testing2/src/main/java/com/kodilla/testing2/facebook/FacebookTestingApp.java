package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String AGREEBUTTON = "//button[2]";
    public static final String CREATEACCOUNTBUTTON = "//*[@role=\"button\" and @data-testid=\"open-registration-form-button\"]";
    public static final String XPATH_WAIT_FOR = "//*[@data-testid=\"cookie-policy-dialog\"]/div[2]";
    public static final String XPATH_WAIT_FOR2 = "//div[contains(@id, \"reg_box\")]/div[1]";
    public static final String MANLABEL = "//span[@data-name=\"gender_wrapper\"]/span[2]/label";
    public static final String FIRSTNAME = "firstname";
    public static final String LASTNAME = "lastname";
    public static final String EMAIL = "reg_email__";
    public static final String EMAILCONFIRMATION = "reg_email_confirmation__";
    public static final String PASSWORD = "reg_passwd__";
    public static final String BDAY = "birthday_day";
    public static final String BMONTH = "birthday_month";
    public static final String BYEAR = "birthday_year";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement agreeButton = driver.findElement(By.xpath(AGREEBUTTON));
        agreeButton.click();

        WebElement newAccountButton = driver.findElement(By.xpath(CREATEACCOUNTBUTTON));
        newAccountButton.click();

        boolean b = true;
        while (b) {
            if (driver.findElements(By.xpath(XPATH_WAIT_FOR2)).size() > 0) {
                while (!driver.findElement(By.xpath(XPATH_WAIT_FOR2)).isDisplayed());
                b = false;
            }
        }

        WebElement firstname = driver.findElement(By.name(FIRSTNAME));
        firstname.sendKeys("Adam");
        firstname.submit();

        WebElement lastname = driver.findElement(By.name(LASTNAME));
        lastname.sendKeys("Nowak");
        lastname.submit();

        WebElement email = driver.findElement(By.name(EMAIL));
        email.sendKeys("abc@gmail.com");
        email.submit();

        WebElement email2 = driver.findElement(By.name(EMAILCONFIRMATION));
        email2.sendKeys("abc@gmail.com");
        email2.submit();

        WebElement password = driver.findElement(By.name(PASSWORD));
        password.sendKeys("password");
        password.submit();

        WebElement selectDayOfBirth = driver.findElement(By.name(BDAY));
        Select selectDay = new Select(selectDayOfBirth);
        selectDay.selectByValue("10");

        WebElement selectMonthOfBirth = driver.findElement(By.name(BMONTH));
        Select selectMonth = new Select(selectMonthOfBirth);
        selectMonth.selectByVisibleText("wrz");

        WebElement selectYearOfBirth = driver.findElement(By.name(BYEAR));
        Select selectYear = new Select(selectYearOfBirth);
        selectYear.selectByValue("2000");

        WebElement manLabel = driver.findElement(By.xpath(MANLABEL));
        manLabel.click();
    }
}
