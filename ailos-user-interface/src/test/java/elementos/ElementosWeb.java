package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	
	// Elementos Web
	
	private By usuario = By.id("user-name");
	private By senha = By.id("password");
	private By botaoLogin = By.id("login-button");
    private By usuarioBloqueado = By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3");
    private By sauceLabsBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private By sauceLabsBoltTshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By sauceLabsFleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By sauceLabsBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private By sauceLabsOnesie = By.id("add-to-cart-sauce-labs-onesie");
    private By sauceTesteAllTheThings = By.id("add-to-cart-sauce-labs-onesie");
	private By carrinho = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	private By checkout = By.id("checkout");
	private By valorTotal = By.cssSelector("#checkout_summary_container > div > div.summary_info > div.summary_total_label");
	private By firstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By zipCode = By.id("postal-code");
	private By continuar = By.id("continue");
	private By finalizar = By.id("finish");
	private By compraFinalizada = By.cssSelector("#checkout_complete_container > div");
	//*[@id="checkout_complete_container"]/div
		
    
	
	// Metodos publicos dos elementos
	
	public By getLastName() {
		return lastName;
	}



	public By getZipCode() {
		return zipCode;
	}



	public By getCarrinho() {
		return carrinho;
	}



	public By getCheckout() {
		return checkout;
	}



	public By getUsuario() {
		return usuario;
	}



	public By getBotaoLogin() {
		return botaoLogin;
	}



	public By getUsuarioBloqueado() {
		return usuarioBloqueado;
	}



	public By getSauceLabsBackpack() {
		return sauceLabsBackpack;
	}



	public By getSauceLabsBoltTshirt() {
		return sauceLabsBoltTshirt;
	}



	public By getSauceLabsFleeceJacket() {
		return sauceLabsFleeceJacket;
	}



	public By getSauceLabsBikeLight() {
		return sauceLabsBikeLight;
	}



	public By getSauceLabsOnesie() {
		return sauceLabsOnesie;
	}



	public By getSauceTesteAllTheThings() {
		return sauceTesteAllTheThings;
	}



	public By getSenha() {
		return senha;
	}



	public By getValorTotal() {
		return valorTotal;
	}



	public By getFirstName() {
		return firstName;
	}



	public By getContinuar() {
		return continuar;
	}



	public By getFinalizar() {
		return finalizar;
	}



	public By getCompraFinalizada() {
		return compraFinalizada;
	}
	
	
}
