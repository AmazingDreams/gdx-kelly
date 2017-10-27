package com.github.amazingdreams.kelly.framework;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class KOrthographicCamera extends KActor {

    private OrthographicCamera camera;

    @Override
    public void beginPlay() {
        this.camera = new OrthographicCamera();
        this.camera.setToOrtho(false, 800, 480);
    }

    public OrthographicCamera getCamera() {
        return this.camera;
    }
}
