package com.characterCreator.controllers;

import com.characterCreator.data.CharacterData;
import com.characterCreator.entities.character.Character;
import com.characterCreator.entities.character.body.Body;
import com.characterCreator.entities.character.color.EntityColor;
import com.characterCreator.entities.character.head.Head;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CharacterController {
    CharacterData characterData = CharacterData.getInstance();

    @GetMapping("/characters")
    public List<Character> getCharacters() {
        return characterData.getCharacterList();
    }

    @PostMapping("/characters/addNew")
    public String addNew(@RequestBody Map<String, String> body) {
        return characterData.addNewCharacter(
                new Head(
                        new EntityColor(body.get("eyes")),
                        new EntityColor(body.get("lips")),
                        new EntityColor(body.get("hair")),
                        Boolean.parseBoolean(body.get("hasLongHair"))),
                new Body(
                        new EntityColor(body.get("skin")),
                        Boolean.parseBoolean(body.get("isFat")),
                        Boolean.parseBoolean(body.get("hasLimbs"))),
                body.get("name"));
    }

    @DeleteMapping("/characters/delete/{name}")
    public String delete(@PathVariable String name) {
        return characterData.deleteCharacter(name);
    }
}
