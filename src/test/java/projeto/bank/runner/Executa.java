package projeto.bank.runner;

import org.openqa.selenium.chrome.ChromeDriver;

import projeto.bank.driver.Driver;

public class Executa extends Driver {
	
	public static void iniciarTeste() {
		
		driver = new ChromeDriver();
		driver.get("http://52.2.114.98/");
		driver.manage().window().maximize();
	}
	
	public static void finalizarTeste() {
		
		driver.quit();
		
		
	}

}
