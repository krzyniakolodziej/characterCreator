package com.characterCreator.entities.character;

import com.characterCreator.entities.character.head.*;
import com.characterCreator.entities.character.body.*;

public class Character {
    private Head head;
    private Body body;

    public Character() {};

    public Character(Head head, Body body) {
        this.head = head;
        this.body = body;
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

}
