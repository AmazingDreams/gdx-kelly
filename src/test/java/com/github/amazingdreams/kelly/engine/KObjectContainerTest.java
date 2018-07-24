package com.github.amazingdreams.kelly.engine;

import com.badlogic.gdx.utils.Array;
import com.github.amazingdreams.kelly.framework.KDrawable;
import com.github.amazingdreams.kelly.framework.KObject;
import com.github.amazingdreams.kelly.testutils.TestDrawableObject;
import com.github.amazingdreams.kelly.testutils.TestObject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KObjectContainerTest {

    private KObjectContainer objectContainer;

    @Before
    public void before() {
        this.objectContainer = new KObjectContainer();
    }

    @Test
    public void testCreateObject() {
        KObject obj = this.objectContainer.createObject(TestDrawableObject.class);

        assertNotNull(obj);
        assertTrue(this.objectContainer.getObjects().size == 1);
    }

    @Test(expected = RuntimeException.class)
    public void testCreateObjectFail() {
        KObject obj = this.objectContainer.createObject(KObject.class);
    }

    @Test
    public void testFindDrawables() {
        KDrawable obj = this.objectContainer.createObject(TestDrawableObject.class);
        KObject obj2 = this.objectContainer.createObject(TestObject.class);

        Array<KDrawable> drawables = this.objectContainer.findObjectsOfClass(KDrawable.class);
        assertTrue(drawables.size == 1);
        assertTrue(drawables.contains(obj, true));
    }

    @Test
    public void testRemoveObject() {
        KObject obj = this.objectContainer.createObject(TestDrawableObject.class);
        KObject obj2 = this.objectContainer.createObject(TestDrawableObject.class);

        Array<KObject> objects = this.objectContainer.getObjects();
        assertTrue(objects.contains(obj, true));
        assertTrue(objects.contains(obj2, true));

        this.objectContainer.removeObject(obj2);

        Array<KObject> objects2 = this.objectContainer.getObjects();
        assertTrue(objects2.contains(obj, true));
        assertFalse(objects2.contains(obj2, true));
    }

}