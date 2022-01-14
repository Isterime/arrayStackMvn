package com.isterime.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void doesConstructiUserInputLength()
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
    @Test
    public void doesConstructInitialLLength()
        {
            Stack testObj = new Stack();
            //testObj.Stack(10);
            boolean passFail = true;
            if(testObj.length() != 10)
            {
                passFail = false; 
            }


            assertTrue( passFail );
            
        }
    @Test
    public void doesConstructiUserInputHead()
    {
        Stack testObj = new Stack(10);
        //testObj.Stack(10);
        boolean passFail = true;
        if(testObj.getHead() != -1)
        {
            passFail = false; 
        }


        assertTrue( passFail );
        
    }
    @Test
    public void doesConstructInitialLHead()
        {
            Stack testObj = new Stack();
            //testObj.Stack(10);
            boolean passFail = true;
            if(testObj.getHead() != -1)
            {
                passFail = false; 
            }
    
    
            assertTrue( passFail );
            
        }
    
    @Test   
    public void ()
        {
            boolean passFail = true;
            if()
             {   
               passFail = false; 
             }   
        
        
            assertTrue( passFail );
            
        } 













/*
     @Test   
     public void ()
        {
            boolean passFail = true;
            if()
             {   
                 passFail = false; 
             }   


            assertTrue( passFail );
        
        }   

*/

}
