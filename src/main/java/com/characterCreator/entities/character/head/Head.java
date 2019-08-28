package com.characterCreator.entities.character.head;

import javafx.scene.paint.Color;

public class Head {
    private Color eyes;
    private Color lips;
    private Color hair;
    private boolean hasLongHair;

    public Head() {};

    public Head(Color eyes, Color lips, Color hair, boolean hasLongHair) {
        this.eyes = eyes;
        this.lips = lips;
        this.hair = hair;
        this.hasLongHair = hasLongHair;
    }

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
