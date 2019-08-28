package com.characterCreator.controllers;

import com.characterCreator.data.CharacterData;
import com.characterCreator.entities.character.Character;
import com.characterCreator.entities.character.body.Body;
import com.characterCreator.entities.character.head.Head;
import javafx.scene.paint.Color;
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
        int reyes = Integer.parseInt(body.get("reyes"));
        int geyes = Integer.parseInt(body.get("geyes"));
        int beyes = Integer.parseInt(body.get("beyes"));
        int oeyes = Integer.parseInt(body.get("oeyes"));

        int rlips = Integer.parseInt(body.get("rlips"));
        int glips = Integer.parseInt(body.get("glips"));
        int blips = Integer.parseInt(body.get("blips"));
        int olips = Integer.parseInt(body.get("olips"));

        int rhair = Integer.parseInt(body.get("rhair"));
        int ghair = Integer.parseInt(body.get("ghair"));
        int bhair = Integer.parseInt(body.get("bhair"));
        int ohair = Integer.parseInt(body.get("ohair"));

        return characterData.addNewCharacter(new Head(
                new Color(reyes,geyes,beyes,oeyes),
                new Color(rlips,glips,blips,olips),
                new Color(rhair,ghair,bhair,ohair),
                Boolean.parseBoolean(body.get("hasLongHair"))),
                new Body(),
                body.get("name"));
    }

    @DeleteMapping("/characters/delete/{name}")
    public String delete(@PathVariable String name) {
        return characterData.deleteCharacter(name);
    }
}
