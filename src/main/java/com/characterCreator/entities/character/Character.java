package com.characterCreator.entities.character;

import com.characterCreator.entities.character.head.*;
import com.characterCreator.entities.character.body.*;
import lombok.Data;

@Data
public class Character {
    private Head head;
    private Body body;
}