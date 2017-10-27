package com.github.amazingdreams.kelly.framework;

import com.badlogic.gdx.math.Vector2;

public class KSceneComponent extends KComponent implements KWorldPosition {

    private KWorldPosition parent;
    private final Vector2 relativePosition = new Vector2();

    @Override
    public void beginPlay() {
        this.parent = (KWorldPosition) this.getOwner();
    }

    @Override
    public void tick(float deltaTime) {
    }

    @Override
    public void destroy() {
    }

    @Override
    public Vector2 getWorldPosition() {
        return this.parent
                .getWorldPosition()
                .cpy()
                .add(this.relativePosition);
    }
}
