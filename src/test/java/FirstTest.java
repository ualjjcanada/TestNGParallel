import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ONUR on 03.12.2016.
 */
public class FirstTest extends TestBase {

    @Test
    public void GOOGLE1() throws Exception {
        System.out.println("Google1 Test Started! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google1 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE2() throws Exception {
        System.out.println("Google2 Test Started! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google2 Test's Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google2 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE3() throws Exception {
        System.out.println("Google3 Test Started! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google3 Test's Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google3 Test Ended! " + Thread.currentThread().getId());
    }
    
    @Test
    public void testLoginok() throws Exception {
      getDriver().navigate().to("http://loginapphmis2019jjcanada.azurewebsites.net/");
      getDriver().findElement(By.linkText("Log in")).click();
      getDriver().findElement(By.id("Input_Email")).click();
      getDriver().findElement(By.id("Input_Email")).clear();
      getDriver().findElement(By.id("Input_Email")).sendKeys("hola2019@ual.es");
      getDriver().findElement(By.id("Input_Password")).clear();
      getDriver().findElement(By.id("Input_Password")).sendKeys("ABab12!!");
      getDriver().findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]")).click();
      Assert.assertEquals("Hello hola2019@ual.es!", getDriver().findElement(By.linkText("Hello hola2019@ual.es!")).getText());
      getDriver().findElement(By.xpath("//form[@id='logoutForm']/ul/li[2]/button")).click();
      Assert.assertTrue(isElementPresent(By.linkText("Log in")));
      Assert.assertEquals("Log in", getDriver().findElement(By.linkText("Log in")).getText());
    }

    private boolean isElementPresent(By by) {
    	try {
    		getDriver().findElement(by);
    		return true;
    	} catch (NoSuchElementException e) {
    		return false;
    	}
    }
}