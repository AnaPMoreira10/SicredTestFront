package sicredFront;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {
	
	Metodos sicred = new Metodos();
	Elementos cadastro = new Elementos();
	

@Given("^que eu acesse o site \"([^\"]*)\"$")
public void que_eu_acesse_o_site(String arg1) throws Throwable {
	sicred.abrirBrowser(arg1);
	}
	@Given("^mudo o valor o valor da combo Select version para Bootstrap V Theme$")
	public void mudo_o_valor_o_valor_da_combo_Select_version_para_Bootstrap_V_Theme() throws Throwable {
		sicred.click(cadastro.btnSelectionVersion);
		sicred.esperarElemento(cadastro.btnVersion);
	    sicred.click(cadastro.btnVersion);  
	}

	@Given("^ao clicar no botão Add Record$")
	public void ao_clicar_no_botão_Add_Record() throws Throwable {
		sicred.click(cadastro.btnAddRecord);
	}


@When("^preencher os campos do formulário$")
public void preencher_os_campos_do_formulário() throws Throwable {
	  sicred.preencherDadosUsuario("Teste Sicredi", "Teste", "Ana Paula", "51 9999-9999", "Av Assis Brasil, 3970", "Torre D", "Porto Alegre", "RS", "91000-000", "Brasil", "127", "200");
	  sicred.click(cadastro.btnSave);
	  
	}
	

	@Then("^valido as informações enviadas$")
	public void valido_as_informações_enviadas() throws Throwable {
		sicred.esperarElemento(cadastro.labelMensagemSucesso);
		sicred.validaTexto(cadastro.labelMensagemSucesso, "Your data has been successfully stored into the database. Edit Record or Go back to list");
		sicred.fecharBrowser();
	}


}
