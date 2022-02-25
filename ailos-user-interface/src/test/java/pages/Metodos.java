package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends AbrirNavegador {

	public void preencher(By elemento, String texto) {

		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.out.println("----ERROR AO PREENCHER----" + e.getMessage());

		}

	}

	public void validar(By elemento, String textoEsperado) {

		try {
			Thread.sleep(3000);
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			System.err.println("----ERROR AO VALIDAR----" + e.getMessage());
		}

	}

	public void click(By elemento) {

		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("----ERROR AO CLICAR----" + e.getMessage());

		}

	}

	public void screenShot(String nome, String passo) throws IOException {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nome + ".png");
			FileUtils.copyFile(scrFile, destFile);

		} catch (Exception e) {
			System.out.println("----ERROR AO TIRAR SCREENSHOT----" + e.getMessage());

		}

	}

	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();

		} catch (Exception e) {
			System.out.println("----ERROR AO DAR SUBMIT----" + e.getMessage());

		}

	}

	public void pausa(int tempo) throws InterruptedException {
		try {
			Thread.sleep(tempo);

		} catch (Exception e) {
			System.out.println("----ERROR AO PAUSAR----" + e.getMessage());

		}

	}

	public void fecharNavegador() {

		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("----ERROR AO FECHAR NAVEGADOR----" + e.getMessage());

		}

	}

}