package sicredFront;

import org.openqa.selenium.By;

public class Elementos {
	
	
	public By btnSelectionVersion = By.id("switch-version-select");
	public By btnVersion = By.cssSelector("#switch-version-select > option:nth-child(4)");
	public By btnAddRecord = By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a");	
	public By btnSave = By.id("form-button-save");
	public By labelMensagemSucesso = By.cssSelector("#report-success > p");
}
