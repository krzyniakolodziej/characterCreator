package com.characterCreator.data;

import java.util.ArrayList;
import java.util.List;

import com.characterCreator.entities.character.Character;
import javafx.scene.paint.Color;
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
       characterList.add(new Character(
               new Head(
                       new Color(1, 1, 1, 0),
                       new Color(1, 1, 1, 0),
                       new Color(1, 1, 1, 0),
                       false),
               new Body(
                       new Color(1, 1, 1, 0),
                       false, true),
               "Adam"));
       characterList.add(new Character(
               new Head(
                       new Color(1, 1, 1, 0),
                       new Color(1, 1, 1, 0),
                       new Color(1, 1, 1, 0),
                       false),
               new Body(
                       new Color(1, 1, 1, 0),
                       false,
                       true),
               "Bradam"));
   }

   public List<Character> getCharacterList() {
       return characterList;
   }

   public String addNewCharacter(Head head, Body body, String name) {
       characterList.add(new Character(head, body, name));
       return String.format("Character %s created successfully", name);
   }

   public String deleteCharacter(String name) {
       Character deleteMe = null;
       String deletedName = null;
       for(Character c : characterList) {
           if(c.getName().equalsIgnoreCase(name)) {
               deleteMe = c;
               deletedName = c.getName();
               break;
           }
       }
       if(deleteMe!=null) {
           characterList.remove(deleteMe);
           return String.format("Character %s deleted successfully", deletedName);
       } else {
           return String.format("No character matches name %s", name);
       }
   }
}
