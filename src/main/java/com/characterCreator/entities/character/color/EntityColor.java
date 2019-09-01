package com.characterCreator.entities.character.color;

public class EntityColor {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public EntityColor() {
        this.color = RandomColor.getRandomHex();
    };

    public EntityColor(String color) {
        if(color == null) {
            this.color = RandomColor.getRandomHex();
        } else {
            this.color = color;
        }
    }
}
