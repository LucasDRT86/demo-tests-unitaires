package fr.diginamic.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testLevenshteinDistanceChatChats() {
		int ecart = StringUtils.levenshteinDistance("chat", "chats");
		assertEquals(1,ecart);
	}
	
	@Test
	void testLevenshteinDistanceChatsChat() {
		int ecart = StringUtils.levenshteinDistance("chats", "chat");
		assertEquals(1,ecart);
	}
	
	@Test
	void testLevenshteinDistanceMachinsMachine() {
		int ecart = StringUtils.levenshteinDistance("machins", "machines");
		assertEquals(1,ecart);
	}
	
	@Test
	void testLevenshteinDistanceAvironAvion() {
		int ecart = StringUtils.levenshteinDistance("aviron", "avion");
		assertEquals(1,ecart);
	}
	
	@Test
	void testLevenshteinDistanceDistanceInstance() {
		int ecart = StringUtils.levenshteinDistance("distance", "instance");
		assertEquals(2,ecart);
	}
	
	@Test
	void testLevenshteinDistanceChienChine() {
		int ecart = StringUtils.levenshteinDistance("chien", "chine");
		assertEquals(2,ecart);
	}
	
	@Test
	void testLevenshteinDistanceVideTest() {
		int ecart = StringUtils.levenshteinDistance("", "test");
		assertEquals(4,ecart);
	}

	@Test
	void testLevenshteinDistanceNull() {
		try {
			StringUtils.levenshteinDistance(null, null);
			fail("Exception attendue pour un paramètre null");
		} catch (IllegalArgumentException e) {			
			assertEquals("Les paramètres ne doivent pas être null", e.getMessage());
		}
	}

}
