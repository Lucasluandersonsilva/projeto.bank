package projeto.bank.elemento;

import org.openqa.selenium.By;

public class Elementos {

	
	//elementos da home page
	public By btnAbrirCta = By.xpath("//button[@class='open-account-button']");
	public By campoCpf = By.id("cpf-input");
	public By btnContinuar = By.xpath("//button[text()='Continuar']");
	public By msgError = By.id("error-message");
	
	//Dados Pessoais
	
	public By nome = By.xpath("//input[@name='firstName']");
	public By sobrenome = By.xpath("//input[@name='lastName']");
	public By email = By.xpath("//input[@name='email']");
	public By telefone = By.xpath("//input[@name='phoneNumber']");
	public By endereco = By.xpath("//input[@name='address']");
	public By rg = By.xpath("//input[@name='rg']");
	public By cep = By.xpath("//input[@name='cep']");
	public By numero = By.xpath("//input[@name='number']");
	public By estado = By.xpath("//input[@name='state']");
	public By cidade = By.xpath("//input[@name='city']");
	public By complemento = By.xpath("//input[@name='complement']");
	public By dataNasc = By.xpath("//input[@name='dataBirthday']");	
	public By textoDadosPessoais = By.xpath("//h2[contains(text(),'Dados Pessoais')]");
	public By btnAvancar = By.xpath("//button[@type='button']");
	
}
