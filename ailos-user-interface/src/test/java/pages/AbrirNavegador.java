package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AbrirNavegador {

	protected static WebDriver driver;

	public void abrirNavegador(String browser, String url) {

		try {
			if (browser == "CHROME") {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser == "FIREFOX") {
				System.setProperty("webdriver.geckodriver.driver", "./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser == "EXPLORER") {
				System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Selecine o navegador: CHROME, FIREFOX OU EXPLORER.");

			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("----ERROR AO ABRIR NAVEGADOR----" + e.getMessage());

		}

	}

}