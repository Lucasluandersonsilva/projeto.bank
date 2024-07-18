package projeto.bank.metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projeto.bank.driver.Driver;

public class Metodos extends Driver{
	
	/*
	 * clicar em um elemento usando By
	 *@param elemento
	 */
	
	public void clicar(By elemento ) {
		driver.findElement(elemento).click();
		
	}
	
	//validar
	public void validarTexto(By elemento, String textoEsperado) {
		
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado,textoEsperado );
		
	}
	
	/*
	 * Escrever um texto usando By
	 * @param elemento
	 * @author Lucas
	 */
	
	public void preencher(By elemento,String texto) {
		
		driver.findElement(elemento).sendKeys(texto);
		
		
	}
	
	public void esperarElementoVisivel(By elemento, int ateQtosSegundos) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(ateQtosSegundos));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		
	}

}
