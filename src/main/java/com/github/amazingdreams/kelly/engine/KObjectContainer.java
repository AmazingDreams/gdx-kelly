package com.github.amazingdreams.kelly.engine;

import com.github.amazingdreams.kelly.framework.KObject;

import java.util.ArrayList;
import java.util.List;

public class KObjectContainer {

    private List<KObject> objects;

    public KObjectContainer() {
        this.objects = new ArrayList<>();
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

    public List<KObject> getObjects() {
        return this.objects;
    }

    public void destroy() {
        for (KObject obj : this.objects) {
            obj.destroy();
        }
    }
}
