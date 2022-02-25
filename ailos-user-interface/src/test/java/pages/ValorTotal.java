package pages;

import elementos.ElementosWeb;

public class ValorTotal {
	
	ElementosWeb elm = new ElementosWeb();
	Metodos mtd = new Metodos();
	CompraProdutos compra = new CompraProdutos();
	
	public void valorTotal() {
		
		mtd.click(elm.getSauceLabsBackpack());		
		mtd.click(elm.getSauceLabsBikeLight());	
		mtd.click(elm.getSauceLabsBoltTshirt());
		mtd.click(elm.getSauceLabsOnesie());
		mtd.click(elm.getSauceTesteAllTheThings());	
		mtd.click(elm.getSauceLabsFleeceJacket());
		mtd.click(elm.getCarrinho());
		mtd.click(elm.getCheckout());
		compra.preencherDados();
		mtd.click(elm.getContinuar());
		
		
	}

}
