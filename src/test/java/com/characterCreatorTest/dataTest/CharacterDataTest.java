package com.characterCreatorTest.dataTest;

import com.characterCreator.data.CharacterData;
import com.characterCreator.entities.character.body.Body;
import com.characterCreator.entities.character.head.Head;
import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterDataTest {
    CharacterData characterData = CharacterData.getInstance();

    @Test
    public void addCharacter() {
        int sizeBefore = characterData.getCharacterList().size();
        characterData.addNewCharacter(new Head(), new Body(), String.format("%stest", characterData.getCharacterList().get(0).getName()));
        assertEquals(sizeBefore + 1, characterData.getCharacterList().size());
    }

    @Test
    public void addNullCharacter() {
        int sizeBefore = characterData.getCharacterList().size();
        characterData.addNewCharacter(new Head(), new Body(), "null");
        assertEquals(sizeBefore, characterData.getCharacterList().size());
    }

    @Test
    public void deleteCharacter() {
        int sizeBefore = characterData.getCharacterList().size();
        characterData.deleteCharacter(characterData.getCharacterList().get(0).getName());
        assertEquals(sizeBefore -1, characterData.getCharacterList().size());
    }

    @Test
    public void deleteNonExistingCharacter() {
        int sizeBefore = characterData.getCharacterList().size();
        characterData.deleteCharacter("null");
        assertEquals(sizeBefore, characterData.getCharacterList().size());
    }
}
