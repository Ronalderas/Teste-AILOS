package tests;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CompraProdutos;
import pages.Metodos;
import pages.UsuarioBloqueado;
import pages.ValorTotal;

public class Steps {

	Metodos metodos = new Metodos();
	UsuarioBloqueado blockedUser = new UsuarioBloqueado();
	ElementosWeb elmweb = new ElementosWeb();
	CompraProdutos compra = new CompraProdutos();	
	ValorTotal valor = new ValorTotal();
	
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String url) {
	    
		metodos.abrirNavegador("CHROME", url);
	}

	@When("informar um usuario bloqueado")
	public void informar_um_usuario_bloqueado() throws IOException {
		
		blockedUser.loginUsuarioBloqueado();

	    
	}

	@Then("valido que o usuario esta bloqueado e não pode efetuar o login")
	public void valido_que_o_usuario_esta_bloqueado_e_não_pode_efetuar_o_login() {
		metodos.validar(elmweb.getUsuarioBloqueado(), "Epic sadface: Sorry, this user has been locked out.");
	}

	@When("informar um usuario valido")
	public void informar_um_usuario_valido() {
		
		compra.login();
		
	    
	}

	@When("selecionar mais de um produto e clicar em <add to cart>")
	public void selecionar_mais_de_um_produto_e_clicar_em_add_to_cart() {
		
		compra.selecionarProdutos();
	    
	}

	@When("clicar em <checkout>")
	public void clicar_em_checkout() {
		
		compra.carrinhoCheckout();
	    
	}

	@When("informar os dados pessoais validos")
	public void informar_os_dados_pessoais_validos() {
		
		compra.preencherDados();
	  
	}

	@When("clicar em <continue>")
	public void clicar_em_continue() {
		
		compra.continuar();
	   
	}

	@When("clicar em <finish>")
	public void clicar_em_finish() {
		
		compra.finalizar();
	    
	}

	@Then("valido que a compra foi efetuada com sucesso")
	public void valido_que_a_compra_foi_efetuada_com_sucesso() throws IOException {
		
		metodos.validar(elmweb.getCompraFinalizada(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
		metodos.screenShot("comprafinalizada", "");
	   
	}

	@When("selecionar todos os produtos e clicar em <add to cart>")
	public void selecionar_todos_os_produtos_e_clicar_em_add_to_cart() throws IOException {
		
		valor.valorTotal();
		metodos.screenShot("valortotal", "");
		metodos.validar(elmweb.getValorTotal(), "140.34");
	   
	}
	

	
	
}
