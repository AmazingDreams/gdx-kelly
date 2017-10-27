package com.github.amazingdreams.kelly.framework;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;

public class KTextureComponent extends KSceneComponent implements KDrawable {

    private Texture texture;
    private int zIndex = 0;
    private int width, height;

    @Override
    public void draw(Batch batch) {
        Vector2 position = this.getWorldPosition();
        batch.draw(this.texture, position.x, position.y, this.width, this.height);
    }

    public int getHeight() {
        return this.height;
    }

    public Texture getTexture() {
        return this.texture;
    }

    public int getWidth() {
        return this.width;
    }

    public int getZIndex() {
        return this.zIndex;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setZIndex(int zIndex) {
        this.zIndex = zIndex;
    }
}
