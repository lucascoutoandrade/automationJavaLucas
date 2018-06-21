package br.com.cursoappium.core;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;



public class BaseTest {
	
	@Rule
	public TestName testname = new TestName();

	@AfterClass
	public static void finalizaClasse() {

		DriverFactory.killDriver();
	}

	@After
	public void finalizaTeste() {
		
		geraScreenShot();
//		DriverFactory.getDriver().resetApp();

	}
	
	public void geraScreenShot() {
		
		File img = DriverFactory.getDriver().getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(img, new File("target/screenshots/"+testname.getMethodName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

}
