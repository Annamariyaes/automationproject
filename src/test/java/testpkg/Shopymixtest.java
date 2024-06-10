package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Shopymixaccount;

public class Shopymixtest extends Baseclass{
	WebDriver driver;
@Test
public void languagedropdown() {
    WebElement language = driver.findElement(By.name("__shop"));
    Select lan = new Select(language);
    lan.selectByVisibleText("EN");
}

@Test
public void accountregister() {
    driver.findElement(By.xpath("//*[@id=\"useraccountmenu\"]/span/i")).click();
    driver.findElement(By.xpath("//*[@id=\"useraccountmenu\"]/div/div[2]/a")).click();


    Shopymixaccount ob = new Shopymixaccount(driver);
    ob.setvalues("anna", "mariya", "annamariya123@gmail.com", "1234afr", "lanstreet", "1234", "ekm");
    ob.selectCountry("Indien");
    
    ob.submit();
}
@Test
public void Designation() {
    WebElement designation = driver.findElement(By.name("register[personal][customer_type]"));
    Select desig = new Select(designation);
    desig.selectByVisibleText("Private customer");
}
@Test
public void Salutation() {
    WebElement salutation = driver.findElement(By.name("register[personal][salutation]"));
    Select desig = new Select(salutation);
    desig.selectByVisibleText("Ms");
}
@Test
public void backhome()
{
driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/nav/div/div[1]/ul/li[1]/a/i")).click();
}
public void selectanitemandaddtocart() {
	driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div/div/section/div[11]/div/div/div[2]/div/div[2]/div/div/div[2]/div/a")).click();
	driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div[1]/div[2]/div[2]/form/div/button")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a")).click();
}
public void logout() {
	driver.findElement(By.xpath("//*[@id=\"useraccountmenu\"]/span/i")).click();
	driver.findElement(By.xpath("//*[@id=\"useraccountmenu\"]/div/a")).click();
}
}
