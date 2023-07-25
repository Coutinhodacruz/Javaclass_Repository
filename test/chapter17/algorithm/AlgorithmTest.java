package chapter17.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    public void testCountSpecialCharacter(){
        String[] strings = {"911@aab23_", "wc4@23-", "Atch+23", "6543ttd<_#"};
        long numberOfSpecialCharacters = Algorithm.countSpecialCharacter(strings);
        assertEquals(7L, numberOfSpecialCharacters);
    }

    @Test
    public void testCountSpecialCharacterTow(){
        String[] strings = {"911@aab23_", "wc4@23-", "Atch+23", "6543ttd<"};
        long numberOfSpecialCharacters = Algorithm.countSpecialCharacter(strings);
        assertEquals(5, numberOfSpecialCharacters);
    }

}