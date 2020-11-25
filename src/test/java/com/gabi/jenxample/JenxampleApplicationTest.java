package com.gabi.jenxample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JenxampleApplicationTest {
    JenxampleApplication application = new JenxampleApplication();

    @Test
    void add() {
        assertEquals(10, application.add(5, 5));
    }
}