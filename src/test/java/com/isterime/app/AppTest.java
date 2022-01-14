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
    public void pushIfFullDoublesArray()
        {
            boolean passFail = true;
            Stack testObj = new Stack();
            int tempLength = testObj.length();
            int tempHead = testObj.getHead();
            for( int i = testObj.getHead(); i < tempLength - 1 ; i++)
            {
                testObj.push(1);
            }
            
            testObj.push(1);
            if(testObj.length() != tempLength * 2 )
             {   
                 
               passFail = false; 
             }   
        
        
            assertTrue( passFail );
            
        } 
    @Test   
    public void pushIfFullArrayCheck()
        {
            boolean passFail = true;
            Stack testObj = new Stack(10);
            int tempLength = testObj.length();
            int tempHead = testObj.getHead();
            for( int i = testObj.getHead(); i < tempLength - 1 ; i++)
            {
                testObj.push(1);
            }
            
            testObj.push(1);
            int[] doubleArray;
            doubleArray = new int[20];
            
            for(int i = 0; i <= 10; i++)
            {
                doubleArray[i] = 1;
            }


            for (int i = testObj.getHead()+1; i <=10; i--)
            {
                if( testObj.pop() == doubleArray[i])    
                {   
                    doubleArray[i] = 0;
                }
                else    
                {
                    passFail = false; 
                }     
            }
        
            assertTrue( passFail );
            
        }

    @Test   
     public void  popupdateshead()
        {
            boolean passFail = true;
            Stack testObj = new Stack(10);
            //make stack populated 1-10
            for(int i = 1; i < 11; i++)
            {
                testObj.push(i);
            }
           
           if(testObj.getHead() != 9)
             {   
                 passFail = false; 
             }   


            assertTrue( passFail );
        
        }
    
     @Test   
     public void  peekworks()
        {
            boolean passFail = true;
            Stack testObj = new Stack(10);
            //make stack populated 1-10

            int counter = 1;
            for(int i = 1; i < 11; i++)
            {
                testObj.push(i);
                if (testObj.peek() == counter)
                {
                    counter++;
                }
                else
                {
                    passFail = false;
                    assertTrue("peek is not working or stack not made properly" + i, passFail);
                }
            }
           
               


            assertTrue( passFail );
        
        }


    @Test   
     public void  peekandpop()
        {
            boolean passFail = true;
            Stack testObj = new Stack(10);
            //make stack populated 1-10
            for(int i = 1; i < 11; i++)
            {
                testObj.push(i);
            }
           for(int i = 1, j = 10; i <= 10 && j >= 0  ; i++, j--)
           {
                if(testObj.peek() != testObj.pop())
                {
                     passFail = false;
                     assertTrue("Fail at iteration "+i,passFail);
                    j--; 
                }
           }
               
            if(testObj.getHead() != -1)
             {   
                 passFail = false;
                 assertTrue("head did not return -1, array not empty", passFail);
             }   
            assertTrue( passFail );
        }
    @Test   
     public void isEmptyreturnproperly()
        {
            boolean passFail = true;
            //make empty stack
            Stack testObj = new Stack();
            if(!testObj.isEmpty())
             {   
                 passFail = false; 
                 assertTrue("does not declare empty properly",passFail);
             }
             
             testObj.push(23);
             if(testObj.isEmpty())
             {
                 passFail = false;
                 assertTrue("does not declare when not empty properly",passFail);
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
     @Test   
     public void  popupdateshead()
        {
            boolean passFail = true;
            Stack testObj = new Stack(10);
            //make stack populated 1-10
            for(int i = 1; i < 11; i++)
            {
                testObj.push(i)
            }
           
           if()
             {   
                 passFail = false; 
             }   


            assertTrue( passFail );
        
        }
*/

}
