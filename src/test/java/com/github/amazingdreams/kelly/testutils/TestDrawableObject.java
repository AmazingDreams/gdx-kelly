package com.github.amazingdreams.kelly.testutils;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.github.amazingdreams.kelly.framework.KDrawable;

public class TestDrawableObject extends TestObject implements KDrawable {

    private boolean hasDrawn = false;

    public boolean hasDrawn() {
        return hasDrawn;
    }

    @Override
    public void draw(Batch batch) {
        this.hasDrawn = true;
    }
}
