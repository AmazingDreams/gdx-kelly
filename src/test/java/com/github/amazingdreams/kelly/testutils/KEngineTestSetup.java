package com.github.amazingdreams.kelly.testutils;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.github.amazingdreams.kelly.engine.KEngine;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class KEngineTestSetup {

    protected KEngine engine;

    @Before
    public void before() {
        this.engine = new KEngine();
    }
}