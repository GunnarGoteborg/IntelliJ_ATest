package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void nine(){
        App myApp = new App();
        assertEquals(9,myApp.add(4,5));
    }

    @Test
    void nineth(){
        App myApp = new App();
        assertEquals(99,myApp.add(94,5));
    }

    @Test
    void fifth(){
        App myApp = new App();
        assertEquals(5,myApp.add(94,5));
    }

    @Test
    void fourth(){
        App myApp = new App();
        assertEquals(4,myApp.add(94,5));
    }



}