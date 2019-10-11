package starter.stepdefinitions;
import static org.mockito.Mockito.*; 
import static org.testng.Assert.assertEquals;

import java.util.List;

import com.modificationAdresse.Service.ConseillerServiceImpl;
import com.modificationAdresse.model.Abonnee;
import com.modificationAdresse.model.Adresse;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Etantdonné;
import cucumber.api.java.fr.Lorsque;

public class AdresseStepDef {
	private Abonnee abonne;
	List <Adresse> listAdresse;
	private String active;
    private String pays;
    private String condition;
	private String canal;
	
static class SetCondition {
    	
    	static String setCondition (String canal) {
    		return "FACE".equals(canal) ? "sans date deffet" : "avec date deffet ";
    }
    }
	
	
	@Etantdonné("un abonne avec une adresse principale \"([^\\\"]*)\" en \"([^\\\"]*)\"$")
	public void un_abonne_avec_une_adresse_principale_active(String active, String pays) {
			 assertEquals("active", active);	
			 assertEquals(pays, "France");
	}

	@Alors("^l'adresse de l'abonne modifiee est enregistree sur l'ensemble des contrats de l'abonne$")	
	public void ladresse_de_labonne_modifiee_est_enregistree_sur_lensemble_des_contrats_de_labonne(){
		if (pays=="France") {
		assertEquals(condition, "sans date deffet");}
		else if (pays=="Pologne") {
		assertEquals(condition, "avec date deffet");}
		
	}

	@Alors("Et ​un mouvement de modification d'adresse est créé")
	public void un_mouvement_de_modification_d_adresse_est_cree() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Lorsque("le conseiller connecte a \"([^\\\"]*)\" modifie l'adresse de l'abonne \"([^\\\"]*)\"$")
	public void le_conseiller_connecte_a_EC_modifie_l_abonne_avec_date_d_effet(String canal,String condition) {
		this.condition = SetCondition.setCondition(canal);
		this.canal = canal;		
		throw new cucumber.api.PendingException();
	}

}
