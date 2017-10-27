package com.github.amazingdreams.kelly.framework;

import com.github.amazingdreams.kelly.engine.KLifecycle;

public abstract class KObject implements KLifecycle {

    private KWorld world;
    private KObject owner;

    public final <T extends KComponent> T createComponent(Class<T> clazz) {
        return this.world.createObject(clazz, this);
    }

    public final KObject getOwner() {
        return this.owner;
    }

    public final KWorld getWorld() {
        return this.world;
    }

    public final void setOwner(KObject owner) {
        this.owner = owner;
    }

    public final void setWorld(KWorld world) {
        this.world = world;
    }
}
