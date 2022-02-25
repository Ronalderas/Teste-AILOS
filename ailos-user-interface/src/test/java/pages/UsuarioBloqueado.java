package pages;

import java.io.IOException;

import elementos.ElementosWeb;

public class UsuarioBloqueado {
	
	ElementosWeb elm = new ElementosWeb();
	Metodos mtd = new Metodos();
	
	
	
	
	public void loginUsuarioBloqueado() throws IOException {
		
		mtd.preencher(elm.getUsuario(), "locked_out_user");
		mtd.preencher(elm.getSenha(), "secret_sauce");
		mtd.click(elm.getBotaoLogin());
		mtd.screenShot("usuariobloqueado", "");
		
		
		
	}

}
