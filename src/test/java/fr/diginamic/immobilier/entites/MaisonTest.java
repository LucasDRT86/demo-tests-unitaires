package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaisonTest {
	
	private Maison maison;

	@BeforeEach
	public void creationMaison() {
		maison = new Maison();
	}
	
	@Test
	void testAjouterPiece() {
		Piece chambre = new Chambre(2,15.2);
		maison.ajouterPiece(chambre);
		assertEquals(1,maison.nbPieces());
	}

	@Test
	public void testSuperficieEtage() {
		maison.ajouterPiece(new Cuisine(0, 20.0));
		maison.ajouterPiece(new Chambre(1, 30.0));
		maison.ajouterPiece(new Chambre(1, 10.0));
		assertEquals(20.0, maison.superficieEtage(0));
		assertEquals(40.0, maison.superficieEtage(1));
	}
	
	@Test
    public void testSuperficieTypePiece() {
        maison.ajouterPiece(new Cuisine(0, 20.0));
        maison.ajouterPiece(new Cuisine(1, 25.0));
        maison.ajouterPiece(new Chambre(1, 30.0));
        maison.ajouterPiece(new Chambre(2, 25.0));
        assertEquals(55.0, maison.superficieTypePiece("Chambre"));
        assertEquals(45.0, maison.superficieTypePiece("Cuisine"));
    }
	
	@Test
    public void testCalculerSurface() {
        maison.ajouterPiece(new Salon(0, 20.0));
        maison.ajouterPiece(new Chambre(1, 30.0));
        assertEquals(50.0, maison.calculerSurface());
    }
	
	@Test
    public void testAjouterPieceNull() {
        maison.ajouterPiece(null);
        assertEquals(0, maison.nbPieces());
    }
	
	@Test
    public void testSuperficieEtageInvalid() {
        assertEquals(0.0, maison.superficieEtage(1));
    }
	
	@Test
    public void testSuperficieTypePieceNull() {
        assertEquals(0.0, maison.superficieTypePiece(null));
    }

}
