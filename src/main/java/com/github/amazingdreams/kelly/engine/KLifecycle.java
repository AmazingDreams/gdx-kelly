package com.github.amazingdreams.kelly.engine;

public interface KLifecycle {
    void beginPlay();
    void tick(float deltaTime);
    void destroy();
}
