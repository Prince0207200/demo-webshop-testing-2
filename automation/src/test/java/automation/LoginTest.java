package automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentials() {
        driver.get("https://demowebshop.tricentis.com");
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        driver.findElement(By.id("Email")).sendKeys("princegupta88746@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();

        String account = driver.findElement(By.className("account")).getText();
        Assert.assertTrue(account.contains("princegupta88746@gmail.com"));
    }

    @Test
    public void loginWithValidEmailWrongPassword() {
        driver.get("https://demowebshop.tricentis.com");
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        driver.findElement(By.id("Email")).sendKeys("princegupta88746@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("12345679");
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();

        String errorEle = driver.findElement(By.className("validation-summary-errors")).getText();
        Assert.assertTrue(errorEle.contains("Login was unsuccessful"));
        Assert.assertTrue(errorEle.contains("The credentials provided are incorrect"));
    }
}
