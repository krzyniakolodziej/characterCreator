package com.characterCreator.entities.character.head;

import com.characterCreator.entities.character.color.Color;

public class Head {
    private Color eyes;
    private Color lips;
    private Color hair;
    private boolean hasLongHair;

    public Head() {};

    public Color getEyes() {
        return eyes;
    }

    public void setEyes(Color eyes) {
        this.eyes = eyes;
    }

    public Color getLips() {
        return lips;
    }

    public void setLips(Color lips) {
        this.lips = lips;
    }

    public Color getHair() {
        return hair;
    }

    public void setHair(Color hair) {
        this.hair = hair;
    }

    public boolean isHasLongHair() {
        return hasLongHair;
    }

    public void setHasLongHair(boolean hasLongHair) {
        this.hasLongHair = hasLongHair;
    }
}
