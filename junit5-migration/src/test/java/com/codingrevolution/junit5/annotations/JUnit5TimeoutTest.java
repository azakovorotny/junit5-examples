package com.codingrevolution.junit5.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class JUnit5TimeoutTest {

    @Test
    void shouldTimeout() {
        Assertions.assertTimeout(Duration.ofMillis(1), () -> Thread.sleep(5));
    }
}
