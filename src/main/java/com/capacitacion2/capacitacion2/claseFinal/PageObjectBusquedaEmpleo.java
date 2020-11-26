package com.capacitacion2.capacitacion2.claseFinal;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectBusquedaEmpleo extends PageFactory {

	public PageObjectBusquedaEmpleo(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "searchBox")
	private WebElement cajaDeBusqueda;

	@FindBy(className = "result-item")
	List<WebElement> listaRespuesta;

	public void escribirOpcionDeBusqueda(String oracionBusqueda) {
		cajaDeBusqueda.sendKeys(oracionBusqueda);
	}

	public void enviarPeticion() {
		cajaDeBusqueda.submit();
	}

	public void imprimirListaResultados() {
		int contador = 1;
		for (WebElement webElement : listaRespuesta) {
			System.out.println("Opción número "+contador);
			System.out.println(webElement.getText() + "\n");
			contador++;
		}

	}

}
