package com.github.amazingdreams.kelly.testutils;

import com.github.amazingdreams.kelly.framework.KObject;

public class TestObject extends KObject {

    private boolean hasTicked = false;

    public boolean hasTicked() {
        return hasTicked;
    }

    @Override
    public void beginPlay() {
    }

    @Override
    public void tick(float deltaTime) {
        this.hasTicked = true;
    }

    @Override
    public void destroy() {

    }
}
