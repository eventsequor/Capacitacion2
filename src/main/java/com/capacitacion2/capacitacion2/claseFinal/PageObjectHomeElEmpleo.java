package com.capacitacion2.capacitacion2.claseFinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectHomeElEmpleo extends PageFactory {

	public PageObjectHomeElEmpleo(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/a/div/img")
	private WebElement buscarEmpleo;
	
	public void darClickBuscarEmpleo() {
		buscarEmpleo.click();
	}


}
