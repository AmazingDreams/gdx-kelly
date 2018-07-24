package com.github.amazingdreams.kelly.engine;

import com.badlogic.gdx.utils.Array;
import com.github.amazingdreams.kelly.framework.KObject;

public class KObjectContainer {

    private Array<KObject> objects;

    public KObjectContainer() {
        this.objects = new Array<>();
    }

    public <T extends KObject> T createObject(Class<T> clazz) {
        try {
            T instance = clazz.newInstance();
            this.objects.add(instance);
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Error creating KObject", e);
        }
    }

    public Array<KObject> getObjects() {
        return this.objects;
    }

    public void destroy() {
        for (KObject obj : this.objects) {
            obj.destroy();
        }
    }

    public <T> Array<T> findObjectsOfClass(Class<T> clazz) {
        Array<T> result = new Array<T>();

        for (KObject obj : this.objects) {
            if (clazz.isInstance(obj)) {
                result.add((T) obj);
            }
        }

        return result;
    }

    public void removeObject(KObject obj) {
        this.objects.removeValue(obj, true);
    }
}
