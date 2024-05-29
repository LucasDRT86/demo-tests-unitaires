package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SaisonTest {

	@Test
	void testValueOffLibellePrintemps() {
		Saison printemps = Saison.valueOfLibelle("Printemps");
		assertEquals(Saison.PRINTEMPS, printemps);
	}

	@Test
	public void testValueOfLibelleEte() {
		Saison ete = Saison.valueOfLibelle("Eté");
		assertEquals(Saison.ETE, ete);
	}

	@Test
	public void testValueOfLibelleAutomne() {
		Saison automne = Saison.valueOfLibelle("Automne");
		assertEquals(Saison.AUTOMNE, automne);
	}

	@Test
	public void testValueOfLibelleHiver() {
		Saison hiver = Saison.valueOfLibelle("Hiver");
		assertEquals(Saison.HIVER, hiver);
	}
	
	@Test
	public void testValueOfLibelleAleatoire() {
		Saison aleatoire = Saison.valueOfLibelle("gdssd");
		assertNull(aleatoire);
	}
	
	@Test
    public void testValueOfLibelleNull() {
        Saison saisonNull = Saison.valueOfLibelle(null);
        assertNull(saisonNull);
    }
	

}
