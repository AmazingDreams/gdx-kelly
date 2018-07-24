package com.github.amazingdreams.kelly.engine;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.Array;
import com.github.amazingdreams.kelly.framework.KDrawable;
import com.github.amazingdreams.kelly.framework.KObject;
import com.github.amazingdreams.kelly.framework.KWorld;

public class KEngine {

    private final KWorld world;

    public KEngine() {
        this.world = new KWorld(this);
    }

    public final <T extends KObject> T createObject(Class<T> clazz, KObject owner) {
        return this.world.createObject(clazz, owner);
    }

    public void tick(float deltaTime) {
        Array<KObject> objects = this.world.getObjects();

        for (KObject obj : objects) {
            obj.tick(deltaTime);
        }
    }

    public void destroy() {
        this.world.destroy();
    }

    public void draw(Batch batch) {
        Array<KDrawable> drawables = this.world.findObjectsOfClass(KDrawable.class);

        batch.begin();
        for (KDrawable obj : drawables) {
            obj.draw(batch);
        }
        batch.end();
    }
}
