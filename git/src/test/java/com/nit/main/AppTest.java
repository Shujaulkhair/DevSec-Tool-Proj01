package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
	
    @Test
    public void sumWithPositiveNumber() {
        
    	int expected = 30;
    	int x = 15;
    	int y = 15;
    	App ap = new App();
    	int acctual = ap.sum(x, y);
    	assertEquals(expected, acctual);
    }
    
    
    @Test
    public void sumWithNegativeNumber() {
        
    	int expected = -30;
    	int x = -15;
    	int y = -15;
    	App ap = new App();
    	int acctual = ap.sum(x, y);
    	assertEquals(expected, acctual);
    }
    
}
