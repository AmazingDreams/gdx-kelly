package com.github.amazingdreams.kelly.framework;

import com.badlogic.gdx.math.Vector2;

public class KActor extends KObject implements KWorldPosition {

    private final Vector2 position = new Vector2();
    private float orientation = 0f;

    @Override
    public void beginPlay() {
    }

    @Override
    public void tick(float deltaTime) {
    }

    @Override
    public void destroy() {
    }

    @Override
    public Vector2 getWorldPosition() {
        return this.position;
    }
}
