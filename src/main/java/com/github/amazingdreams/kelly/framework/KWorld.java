package com.github.amazingdreams.kelly.framework;

import com.github.amazingdreams.kelly.engine.KEngine;

public class KWorld {

    private KEngine engine;

    public final <T extends KObject> T createObject(Class<T> clazz, KObject owner) {
        return this.engine.createObject(clazz, owner);
    }

    public final KEngine getEngine() {
        return this.engine;
    }

    public final void setEngine(KEngine engine) {
        this.engine = engine;
    }
}
