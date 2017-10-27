package com.github.amazingdreams.kelly.engine;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.github.amazingdreams.kelly.framework.KDrawable;
import com.github.amazingdreams.kelly.framework.KObject;
import com.github.amazingdreams.kelly.framework.KWorld;

import java.util.List;

public class KEngine {

    private KWorld world;
    private KObjectContainer objectContainer;
    private Batch batch;

    public KEngine() {
        this.batch = new SpriteBatch();

        this.world = new KWorld();
        this.world.setEngine(this);

        this.objectContainer = new KObjectContainer();
    }

    public <T extends KObject> T createObject(Class<T> clazz, KObject owner) {
        T instance = this.objectContainer.createObject(clazz);

        instance.setOwner(owner);
        instance.setWorld(world);

        instance.beginPlay();

        return instance;
    }

    public void tick(float deltaTime) {
        List<KObject> objects = this.objectContainer.getObjects();

        for (KObject obj : objects) {
            obj.tick(deltaTime);
        }

        // Find drawable objects
        batch.begin();
        for (KObject obj : objects) {
            if (obj instanceof KDrawable) {
                ((KDrawable) obj).draw(batch);
            }
        }
        batch.end();
    }

    public void destroy() {
        this.objectContainer.destroy();
    }

    public Batch getBatch() {
        return this.batch;
    }
}
