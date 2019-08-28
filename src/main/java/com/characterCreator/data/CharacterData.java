package com.characterCreator.data;

import java.util.ArrayList;
import java.util.List;

import com.characterCreator.entities.character.Character;
import com.characterCreator.entities.character.color.Color;
import com.characterCreator.entities.character.head.*;
import com.characterCreator.entities.character.body.*;

public class CharacterData {
   private List<Character> characterList;
   private static CharacterData instance = null;
   public static CharacterData getInstance() {
       if(instance == null) {
           return new CharacterData();
       }
       return instance;
   }

   public CharacterData() {
       characterList = new ArrayList<Character>();
       characterList.add(new Character(new Head(), new Body()));
   }
}
