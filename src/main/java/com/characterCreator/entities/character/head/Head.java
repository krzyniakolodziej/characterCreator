package com.characterCreator.entities.character.head;

import com.characterCreator.entities.character.color.Color;
import lombok.Data;

@Data
public class Head {
    private Color eyes;
    private Color lips;
    private Color hair;
    private boolean hasLongHair;
}
