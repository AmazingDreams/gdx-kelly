package com.github.amazingdreams.kelly.framework;

import com.badlogic.gdx.utils.Array;
import com.github.amazingdreams.kelly.engine.KEngine;
import com.github.amazingdreams.kelly.engine.KObjectContainer;

public class KWorld {

    private final KEngine engine;
    private final KObjectContainer objectContainer;

    public KWorld(KEngine engine) {
        this.engine = engine;
        this.objectContainer = new KObjectContainer();
    }

    public final <T extends KObject> T createObject(Class<T> clazz, KObject owner) {
        T instance = this.objectContainer.createObject(clazz);

        instance.setOwner(owner);
        instance.setWorld(this);

        instance.beginPlay();

        return instance;
    }

    public void destroy() {
        this.objectContainer.destroy();
    }

    public final KEngine getEngine() {
        return this.engine;
    }

    public Array<KObject> getObjects() {
        return this.objectContainer.getObjects();
    }

    public <T> Array<T> findObjectsOfClass(Class<T> clazz) {
        return this.objectContainer.findObjectsOfClass(clazz);
    }
}
