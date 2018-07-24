package com.github.amazingdreams.kelly.engine;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.github.amazingdreams.kelly.testutils.TestDrawableObject;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class KEngineTest {

    private KEngine engine;

    @Before
    public void before() {
        this.engine = new KEngine();
    }

    @Test
    public void testCreateObject() {
        TestDrawableObject obj = this.engine.createObject(TestDrawableObject.class, null);

        assertNotNull(obj);
    }

    @Test
    public void testDraw() {
        TestDrawableObject obj = this.engine.createObject(TestDrawableObject.class, null);

        Batch batch = Mockito.mock(Batch.class);
        this.engine.draw(batch);

        assertTrue(obj.hasDrawn());
    }

    @Test
    public void testDestroy() {
        TestDrawableObject obj = this.engine.createObject(TestDrawableObject.class, null);

        // TODO: check if we can find something to assert
        this.engine.destroy();
    }

    @Test
    public void testTick() {
        TestDrawableObject obj = this.engine.createObject(TestDrawableObject.class, null);

        this.engine.tick(1f/ 60f);

        assertTrue(obj.hasTicked());
    }
}