package com.characterCreator.entities.character;

import com.characterCreator.entities.character.head.*;
import com.characterCreator.entities.character.body.*;

public class Character {
    private Head head;
    private Body body;
    private String name;

    public Character() {};

    public Character(Head head, Body body, String name) {
        this.head = head;
        this.body = body;
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
