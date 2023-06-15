package com.example;

import com.example.HelloWorld;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        String message = helloWorld.getMessage();
        assertEquals("Hello, World!", message);
    }
}
