package com.characterCreator.entities.character.body;

import com.characterCreator.entities.character.color.EntityColor;


public class Body {
    private EntityColor skin;
    private boolean isFat;
    private boolean hasLimbs;

    public Body() {};

    public Body(EntityColor skin, boolean isFat, boolean hasLimbs) {
        this.skin = skin;
        this.isFat = isFat;
        this.hasLimbs = hasLimbs;
    }

    public EntityColor getSkin() {
        return skin;
    }

    public void setSkin(EntityColor skin) {
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
