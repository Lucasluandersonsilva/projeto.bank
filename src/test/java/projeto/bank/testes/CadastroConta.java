package projeto.bank.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import projeto.bank.elemento.Elementos;
import projeto.bank.metodos.Metodos;
import projeto.bank.runner.Executa;

public class CadastroConta extends Executa {
	
	 Metodos metodo = new Metodos();
	 Elementos elemento = new Elementos();
	
	@BeforeEach
	public void abrirNavegador() {
		Executa.iniciarTeste();
		metodo.clicar(elemento.btnAbrirCta);
	
	}
	@AfterEach
	public void fecharNavegafor() {
		Executa.finalizarTeste();
	}

	
	//@Test
	public void cpfEmBranco() {
		
		metodo.clicar(elemento.btnContinuar);
		metodo.esperarElementoVisivel(elemento.msgError, 5);
		metodo.validarTexto(elemento.msgError, "Erro na verificação do CPF");
		
	}
	
	//@Test
	public void cpfENaoFuncionario() {
		metodo.preencher(elemento.campoCpf, "104.104.104-79");
		metodo.clicar(elemento.btnContinuar);
		metodo.esperarElementoVisivel(elemento.msgError, 5);
		metodo.validarTexto(elemento.msgError, "O CPF fornecido não é de um funcionário.");
		
		
	}
	
	@Test
	public void cadastro() {
		metodo.preencher(elemento.campoCpf, "104.104.104-79");
		metodo.clicar(elemento.btnContinuar);
		metodo.esperarElementoVisivel(elemento.nome, 10);
		metodo.preencher(elemento.nome, "anderson");
	}
}
