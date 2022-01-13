package com.isterime.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void doesConstructWithoutInput()
    {
        Stack testObj = new Stack(10);
        //testObj.Stack(10);
        boolean passFail = true;
        if(testObj.length() != 10)
        {
            passFail = false; 
        }


        assertTrue( passFail );
        
    }
}
