package com.github.amazingdreams.kelly.framework;

import com.github.amazingdreams.kelly.testutils.KEngineTestSetup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class KObjectTest extends KEngineTestSetup {

    private KObject obj;

    @Before
    public void before() {
        super.before();

        this.obj = this.engine.createObject(KActor.class, null);
    }

    @Test
    public void testCreateComponent() {
        KSceneComponent component = this.obj.createComponent(KSceneComponent.class);

        assertNotNull(component);
    }
}