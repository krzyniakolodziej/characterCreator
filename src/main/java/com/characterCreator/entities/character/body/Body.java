package com.characterCreator.entities.character.body;

import javafx.scene.paint.Color;


public class Body {
    public Body() {};
    private Color skin;
    private boolean isFat;
    private boolean hasLimbs;

    public Body(Color skin, boolean isFat, boolean hasLimbs) {
        this.skin = skin;
        this.isFat = isFat;
        this.hasLimbs = hasLimbs;
    }

    public Color getSkin() {
        return skin;
    }

    public void setSkin(Color skin) {
        this.skin = skin;
    }

    public boolean isFat() {
        return isFat;
    }

    public void setFat(boolean fat) {
        isFat = fat;
    }

    public boolean isHasLimbs() {
        return hasLimbs;
    }

    public void setHasLimbs(boolean hasLimbs) {
        this.hasLimbs = hasLimbs;
    }
}
