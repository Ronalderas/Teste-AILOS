package pages;

import elementos.ElementosWeb;

public class CompraProdutos {
	ElementosWeb elm = new ElementosWeb();
	Metodos mtd = new Metodos();

	public void login() {
		mtd.preencher(elm.getUsuario(), "standard_user");
		mtd.preencher(elm.getSenha(), "secret_sauce");
		mtd.click(elm.getBotaoLogin());
	}

	public void selecionarProdutos() {
		mtd.click(elm.getSauceLabsBackpack());
		mtd.click(elm.getSauceLabsBikeLight());

	}

	public void carrinhoCheckout() {
		mtd.click(elm.getCarrinho());
		mtd.click(elm.getCheckout());

	}

	public void preencherDados() {
		mtd.preencher(elm.getFirstName(), "Teste");
		mtd.preencher(elm.getLastName(), "Teste");
		mtd.preencher(elm.getZipCode(), "06341770");

	}

	public void continuar() {
		mtd.click(elm.getContinuar());
	}

	public void finalizar() {

		mtd.click(elm.getFinalizar());

	}

}
