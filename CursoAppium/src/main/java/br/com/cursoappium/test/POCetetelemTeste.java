package br.com.cursoappium.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.cursoappium.pages.ServicosPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class POCetetelemTeste  {
	
	private static WebDriver driver;
	private static WebDriverWait wait;  
	private static ServicosPage servicosPage = new ServicosPage();
	
	@BeforeClass
	
	public static  void antesTeste() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "br.com.cetelem.mobilebank.uat");
//		desiredCapabilities.setCapability("appWaitActivity", ".activities.*");
//		desiredCapabilities.setCapability("appActivity", "br.com.cetelem.mobilebank.login.cpf.CPFActivity");
		desiredCapabilities.setCapability("appActivity", "br.com.cetelem.mobilebank.presentation.splash.SplashActivity");
		desiredCapabilities.setCapability("autoGrantPermissions", "true");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		wait = new WebDriverWait(driver,10);
	}
	
	@Test
	
	public void deveAcessarHomeBankingComSucesso() {
	
		driver.findElement(By.id("br.com.cetelem.mobilebank.uat:id/edittext_cpf")).sendKeys("24258594385");
		
		driver.findElement(By.xpath("//*[@text='ACESSAR']")).click();
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='CONFIRMAR']")));
		
		driver.findElement(By.xpath("//*[@text='1']")).click();
		driver.findElement(By.xpath("//*[@text='0']")).click();
		driver.findElement(By.xpath("//*[@text='1']")).click();
		driver.findElement(By.xpath("//*[@text='0']")).click();
		driver.findElement(By.xpath("//*[@text='1']")).click();
		driver.findElement(By.xpath("//*[@text='0']")).click();
		
		driver.findElement(By.xpath("//*[@text='CONFIRMAR']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Cartões']")));
		
		System.out.println("Fim CT_deveAcessarHomeBankingComSucesso");	
		
	}
	
	@Test
	public void deveAcessarTelaCartao() {
		
		driver.findElement(By.xpath("//*[@text='Meu cartão']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Meu cartão']")));
		System.out.println("Fim CT_deveAcessarTelaCartao");	
			
	}
	
	@Test
	public void deveAcessarTelaFatura() {
		
		driver.findElement(By.xpath("//*[@text='VER FATURA']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Faturas']")));
		System.out.println("Fim CT_deveAcessarTelaFatura");	
		
		
	}
	
	@Test
	public void deveSairDaAplicacao() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@text='SERVIÇOS']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Alterar senha']")));
		servicosPage.scroll(0.9, 0.1, driver);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@text='SAIR']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Digite seu CPF abaixo:']")));
		
		System.out.println("Fim CT_deveSairDaAplicacao");	
		
		
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("Fim da execução");
		driver.quit();
	}
	

}
