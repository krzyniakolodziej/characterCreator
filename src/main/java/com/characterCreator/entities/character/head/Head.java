package com.characterCreator.entities.character.head;

import com.characterCreator.entities.character.color.EntityColor;

public class Head {
    private EntityColor eyes;
    private EntityColor lips;
    private EntityColor hair;
    private boolean hasLongHair;

    public Head() {};

    public Head(EntityColor eyes, EntityColor lips, EntityColor hair, boolean hasLongHair) {
        this.eyes = eyes;
        this.lips = lips;
        this.hair = hair;
        this.hasLongHair = hasLongHair;
    }

    public EntityColor getEyes() {
        return eyes;
    }

    public void setEyes(EntityColor eyes) {
        this.eyes = eyes;
    }

    public EntityColor getLips() {
        return lips;
    }

    public void setLips(EntityColor lips) {
        this.lips = lips;
    }

    public EntityColor getHair() {
        return hair;
    }

    public void setHair(EntityColor hair) {
        this.hair = hair;
    }

    public boolean isHasLongHair() {
        return hasLongHair;
    }

    public void setHasLongHair(boolean hasLongHair) {
        this.hasLongHair = hasLongHair;
    }
}
