package com.characterCreator.entities.character.body;

import com.characterCreator.entities.character.color.Color;
import lombok.Data;

@Data
public class Body {
    private Color skin;
    private boolean isFat;
    private boolean hasLimbs;
}
